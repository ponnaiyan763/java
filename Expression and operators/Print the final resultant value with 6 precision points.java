import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=(a+8)/3;
        int c=(b%5)*5;
        System.out.printf("%.6f",(double)c);
    }
}