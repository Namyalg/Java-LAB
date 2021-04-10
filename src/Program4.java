import java.util.*;
public class Program4 {
    public static void main(String[] args){
        int arr[];
        Scanner input = new Scanner(System.in);
        int size, el;
        System.out.println("Enter the size of the array : ");
        size = input.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i = 0; i < size; i++) {
            System.out.println("Enter the element : ");
            el = input.nextInt();
            arr[i] = el;
        }
        int left = 0;
        int right = size - 1;

        //odd before even

        //[5,6,3,9,10,64]
        /*left = 0 right = 5
        left = odd left += 1 left = 1
        right = even right -= 1 right = 4

        left and right
        if left is even

         */
        while (left < right){
            if(arr[left] % 2 == 1){
                left += 1;
            }
            if(arr[right] % 2 == 0){
                right -= 1;
            }
            else{
                if(arr[left] % 2 == 0 && arr[right] % 2 == 1) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left += 1;
                    right -= 1;
                }
            }
        }
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
