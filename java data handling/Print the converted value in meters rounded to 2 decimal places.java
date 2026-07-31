import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b=(a*0.0254f);
        System.out.printf("%d inch is %.2f meters",a,b);
    }
    
}