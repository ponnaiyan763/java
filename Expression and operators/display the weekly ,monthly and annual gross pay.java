import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        float r=sc.nextFloat();
        System.out.printf("Weekly Gross Pay: %.1f\n",h*r);
        System.out.printf("Monthly Gross Pay: %.1f\n",(h*r*52)/12);
        System.out.printf("Annual Gross Pay: %.1f\n",(h*r*52));
    }
}