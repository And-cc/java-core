package 牛客;

import java.util.Scanner;


public class demo死亡率 {

    public static void main(String[] args) {
        char a='\n';
        System.out.println("hello"+ a +"dsfa");
        Scanner scanner = new Scanner(System.in);
        long i=scanner.nextLong();
        long j=scanner.nextLong();
        double x=j*1.0/i*100;
        System.out.println(String.format("%.3f",x)+"%");
    }

}
