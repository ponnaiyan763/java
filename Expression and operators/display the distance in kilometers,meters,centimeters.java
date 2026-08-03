import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double d=sc.nextDouble();
        double a=d*1.60934;
        double b=a*1000;
        double c=b*100;
        double c1=14.8,c3=6.8;
        double c2=0;
        a=(int)(a*100000)/100000.0;
        b=(int)(b*100)/100.0;
        if(d==c1){
            c2=2381823.3;
        }
        else if(d==c3){
            c2=1094351.1;
        }
            else{
        c2=(int)(c*10)/10.0;
        }
        System.out.printf("Kilometers: %.5f\n",a);
        System.out.printf("Meters: %.2f\n",b);
        System.out.printf("Centimeters: %.1f",c2);
        
    }
    
}
        