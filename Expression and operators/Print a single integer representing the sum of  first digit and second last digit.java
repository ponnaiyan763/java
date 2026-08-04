import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long count=0,c=0,b=0;
        while(a>0){
            b=a%10;
            count++;
            if(count==2){
                c=b;
            }
            a/=10;
        }
        System.out.print(c+b);
    }
    
}