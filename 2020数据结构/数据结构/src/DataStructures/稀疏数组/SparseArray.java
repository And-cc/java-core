package DataStructures.稀疏数组;

import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/03/05/11:21
 * @Description:稀疏数组
 */
public class SparseArray {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int[][] original = createOriginal(x, y);
        original[5][7]=1;
        original[3][2]=2;
        printOriginal(original);
        int[][] sparseArray = originalTurnSparse(original);
        printOriginal(sparseArray);
        int[][] ints = sparseTurnOriginal(sparseArray);
        printOriginal(ints);
    }

    /**
     * 创建原始的二维数组11*11（0：没有棋子，1：表示黑子，2：表示白子）
     * @param x
     * @param y
     * @return
     */
    public static int[][] createOriginal(int x,int y){
        int[][] originalArray=new int[x][y];
        return originalArray;
    }

    /**
     * 打印输出原始的二维数组
     * @param array
     */
    public static void printOriginal(int[][] array){
        for (int[] ints : array) {
            for (int i : ints) {
                System.out.printf("%d\t",i);
            }
            System.out.println();
        }
    }

    /**
     * 将二维数组转稀疏数组
     * @param array
     */
    public static int[][] originalTurnSparse(int[][] array){
        int sum=0;
        /**
         * 遍历数组拿到有几个元素
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j]!=0){
                    sum++;
                }
            }
        }
        /**
         * 创建对应的稀疏数组
         */
        int sparseArray[][]=new int[sum+1][3];
        sparseArray[0][0]= array.length;
        sparseArray[0][1]= array.length;
        sparseArray[0][2]= sum;

        int count=0;
        /**
         * 遍历二维数组，将值存入稀疏数组
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j]!=0){
                    count++;
                    sparseArray[count][0]=i;
                    sparseArray[count][1]=j;
                    sparseArray[count][2]=array[i][j];
                }
            }
        }
        return sparseArray;
    }

    /**
     * 稀疏数组转为二维数组
     * @param sparse
     * @return
     */
    public static int[][] sparseTurnOriginal(int[][] sparse){
        int[][] originalArray=new int[sparse[0][0]][sparse[0][1]];
        for (int i = 1; i < sparse.length; i++) {
            originalArray[sparse[i][0]][sparse[i][1]]=sparse[i][2];
        }
        return originalArray;
    }
}
