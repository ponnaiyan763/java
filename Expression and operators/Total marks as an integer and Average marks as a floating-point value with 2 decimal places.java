import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        double d=(a+b+c)/3.0;
    
        System.out.println("Total Marks: "+(a+b+c));
        System.out.printf("Average Marks: %.2f",d);
    }
}