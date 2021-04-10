import java.util.Scanner;
public class Program2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the target value ");
        int target = input.nextInt();
        if(target < 0 || target > 36){
            System.out.println("Cannot get combinations ");
            return;
        }
        int count = 0;
        for(int a = 0 ; a <= 9; a++){
            for(int b = 0; b <= 9; b++){
                for(int c = 0; c <= 9; c++){
                    for(int d = 0; d <= 9; d++){
                        if(a + b + c + d == target){
                            System.out.println(a + " " + b + " " + c + " " + d);
                            count += 1;
                        }
                    }
                }
            }
        }
        System.out.println("The number of combinations are : " + count);
    }
}
