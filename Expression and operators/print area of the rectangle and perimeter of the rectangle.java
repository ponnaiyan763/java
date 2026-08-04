import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long b=sc.nextLong();
        System.out.println("Area: "+(l*b));
        System.out.println("Perimeter: "+(l+b)*2);
    }
}