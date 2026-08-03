import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        System.out.printf("Yards: %.1f\n",(n*1760));
        System.out.printf("Feet: %.1f\n",(n*5280));
        System.out.printf("Inches: %.1f\n",(n*63360));
        
    }
}