import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=a/365;
        a%=365;
        long c=a/7;
        a%=7;
        System.out.println("Years: "+b);
        System.out.println("Weeks: "+c);
        System.out.print("Days: "+a);
    }
}