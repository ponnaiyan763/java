import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Ages in Months: "+a*12);
        System.out.println("Ages in Days: "+a*365);
        System.out.println("Ages in Hours: "+a*365*24);
        System.out.println("Ages in Seconds: "+a*365*24*3600);
    }
}