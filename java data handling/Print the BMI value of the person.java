import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a=sc.nextDouble();
        System.out.printf("BMI = %.2f",n/(a*a));
    }
    
}