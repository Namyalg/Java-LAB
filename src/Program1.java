import java.util.Scanner;

public class Program1 {
    public static void fun1(){
        System.out.println("Im good");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter seconds :  ");
        int seconds = input.nextInt();
        if(seconds < 0){
            System.out.println("Time cannot be negative");
            return;
        }
        else {
            //System.out.println("Number of seconds " + seconds);
            int hours = seconds / 3600;
            seconds = seconds % 3600;
            System.out.println(hours);
            int minutes = seconds / 60;
            seconds = seconds % 60;
            System.out.print("Time in HH : MM : SS is ");
            System.out.println(hours + " : " + minutes + " : " + seconds);
            input.close();
        }
    }
}
