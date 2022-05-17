package 牛客;

import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2021/12/09/19:33
 * @Description:
 */
public class demo211209双层金字塔 {
    public static void main(String[] s){
        Scanner in=new Scanner(System.in);
        while(in.hasNext())
        {
            int n = in.nextInt();
            for (int i = 1; i < n; i++)
            {
                for (int j = 1; j <= n - i; j++)
                    System.out.print(" ");
                for (int j = 1; j <= 2 * i - 1; j++)
                    System.out.print("*");
                System.out.println();
            }
            for (int i = n; i >= 1; i--)
            {
                for (int j = 1; j <= n - i; j++)
                    System.out.print(" ");
                for (int j = 1; j <= 2 * i - 1; j++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
