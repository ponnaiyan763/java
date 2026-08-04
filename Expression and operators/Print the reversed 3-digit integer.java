import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long sum=0,rev=0,b=0;
        while(a>0){
            b=a%10;
            rev=rev*10+b;
            a/=10;
            
           }
           System.out.print(rev);
        }
        
    }