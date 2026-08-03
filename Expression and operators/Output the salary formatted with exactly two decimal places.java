import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String emp=sc.nextLine();
        int hr=sc.nextInt();
        float slr=sc.nextFloat();
        System.out.println("Employee's ID = "+emp);
        System.out.printf("Salary = Rs. %.2f",hr*slr);
    }
}