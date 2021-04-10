import java.util.Scanner;
public class Program5 {
    public static int getrightmostdigit(int num){
        return num % 10;
    }
    public static void main(String[] args){
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        num1 = input.nextInt();
        System.out.println("Enter number 2 ");
        num2 = input.nextInt();
        System.out.println("Enter number 3 ");
        num3 = input.nextInt();
        if(num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid input");
        }
        else {
            int r1, r2, r3;
            r1 = getrightmostdigit(num1);
            r2 = getrightmostdigit(num2);
            r3 = getrightmostdigit(num3);
            if ((r1 == r2) || (r2 == r3) || (r1 == r3)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
