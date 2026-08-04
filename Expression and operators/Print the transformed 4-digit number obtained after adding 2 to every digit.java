import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b,c;
        String d="";
        while(a>0){
            b=(a%10);
            c=(b+2)%10;
            d=c+d;
            a/=10;
        }       
        System.out.print(d);
    }
}