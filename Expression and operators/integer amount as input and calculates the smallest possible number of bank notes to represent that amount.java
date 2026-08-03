import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=n/100;
        n=n%100;
        int n2=n/50;
        n=n%50;
        int n3=n/20;
        n=n%20;
        int n4=n/10;
        n=n%10;
        int n5=n/5;
        n=n%5;
        int n6=n/2;
        n=n%2;
        int n7=n/1;
        n=n%1;
        System.out.println(n1+" Note(s) of 100.00");
        System.out.println(n2+" Note(s) of 50.00");
        System.out.println(n3+" Note(s) of 20.00");
        System.out.println(n4+" Note(s) of 10.00");
        System.out.println(n5+" Note(s) of 5.00");
        System.out.println(n6+" Note(s) of 2.00");
        System.out.println(n7+" Note(s) of 1.00");
    }
}