package 牛客;

import java.util.Scanner;

public class niuke1001{
    public static void main(String[] s) {
        Scanner in=new Scanner(System.in);
        int x,n=in.nextInt();
        for(x=1;x<=n;x++){
            if(n%3==2 && n%5==3 && n%7==2){
                System.out.println(x);
            }
        }
        System.out.println(23%3);
    }

}
