import java.util.*;

public class Pg6 {
    public static void main(String[] args){
        System.out.println("Enter the rows and columns in ascending order ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns = sc.nextInt();
        System.out.println("Enter array elements : ");
        int twoD[][] = new int[rows][columns];
        int target;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++) {
                twoD[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value to be searched for : ");
        target = sc.nextInt();
        int left = rows - 1;
        int right = (rows * columns) - 1;
        int num;
        while (left <= right){
            int mid = (left + right) / 2;
            num = twoD[mid/columns][mid % columns];
            if (num == target){
                System.out.println ("Found at " + left % rows +  " " + right % columns);
                return;
            }
            else if(num > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        System.out.println("Value is not found");
    }
}
