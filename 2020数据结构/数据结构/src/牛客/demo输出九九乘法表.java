package 牛客;

/**
 * @Author: yqy
 * @Date: 2022/02/22/21:45
 * @Description:
 */
public class demo输出九九乘法表 {
    public static void main(String[] args) {
                for(int i=1;i<=9;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print(i+"*"+j+"="+i*j+" ");
                    }
                    System.out.println();
                }
            }
        }
