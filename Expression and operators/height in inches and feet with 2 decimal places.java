import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int cm=sc.nextInt();
        double inches=cm/2.54;
        int feet=(int)(inches/12);
        inches=inches%12;
        System.out.printf("Height in feet and inches: %d' %.1f\"",feet,inches);
    }
}
