package DataStructures.稀疏数组;
//创建稀疏数组
//模拟棋盘存，取
public class demoCreateSparseArray {
    public static void main(String[] args) {
        int chessArr1[][]=new int[11][11];
        chessArr1[1][2]=1;chessArr1[2][3]=2;chessArr1[4][5]=2;
        //输出原始二维数组
        for (int[] ints : chessArr1) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();
        }
        //二维数组转稀疏数组
        //1.先遍历二维数组，得到非零的个数
        int sum=0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if (chessArr1[i][j]!=0){
                    sum++;
                }
            }
        }
        //2.创建对应的稀疏数组
        int sparseArr[][]=new int[sum+1][3];
        //3.给稀疏数组赋值
        sparseArr[0][0]= chessArr1.length;
        sparseArr[0][1]= chessArr1.length;
        sparseArr[0][2]= sum;
        //4.遍历二维数组，将非零数据存入稀疏数组
        int count=0;
        for (int i = 0; i < chessArr1.length; i++) {
            for (int j = 0; j < chessArr1.length; j++) {
                if (chessArr1[i][j]!=0){
                    count++;
                    sparseArr[count][0]= i;
                    sparseArr[count][1]= j;
                    sparseArr[count][2]= chessArr1[i][j];
                }
            }
        }
        System.out.println("!!!!!!稀疏数组!!!!!");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",
                    sparseArr[i][0],
                    sparseArr[i][1],
                    sparseArr[i][2]);
        }
        /*
        * 将稀疏数组恢复成原始的二维数组
        * 1.先读取稀疏数组第一行，根据第一行的数据，创建原始的二维数组，
        * 2.再读取稀疏数组后几行的数据，并赋给原始的二维数组即可
        * */
        int charseArr2[][]=new int[sparseArr[0][0]][sparseArr[0][1]];
        /*System.out.println("创建新数组");
        for (int[] ints : charseArr2) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();
        }*/
        for (int i = 1; i <sparseArr.length ; i++) {
            charseArr2[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2];
        }
        System.out.println("复原数组");
        for (int[] ints : charseArr2) {
            for (int anInt : ints) {
                System.out.printf("%d\t",anInt);
            }
            System.out.println();
        }
    }
}
