import java.util.*;

public class ReverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.println("Enter the array element: ");
            arr[i] = sc.nextInt();
        }
        int startIndex = 0;
        int lastIndex = n-1;

        while(startIndex < lastIndex){
            int temp = arr[startIndex];
            arr[startIndex] = arr[lastIndex];
            arr[lastIndex] = temp;
            startIndex++;
            lastIndex--;
        }

        System.out.println("After swapping the element in the same array: ");

        for(int i = 0; i < n; i++){
            System.out.println("arr: "+ arr[i]);
        }

        sc.close();
    }
}