import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=(5.0/9)*(a-32);
        System.out.printf("%.2f",b);
    }
}