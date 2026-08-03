import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float r=sc.nextFloat();
        float l=sc.nextFloat();
        float w=sc.nextFloat();
        float b=sc.nextFloat();
        float h=sc.nextFloat();
        System.out.printf("Area of a Circle: %.5f\n",(3.14159*(r*r)));
        System.out.printf("Area of a Rectangle: %.1f\n",l*w);
        System.out.printf("Area of a Triangle: %.1f",(b*h)/2);
    }
}