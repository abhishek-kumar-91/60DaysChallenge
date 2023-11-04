  import java.util.*;

public class SecondLargestElementArray {
  
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int ans = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            System.out.println("Enter the array element: ");
            arr[i] = sc.nextInt();
        }
    
        for(int i = 0; i < n; i++){
          if(arr[i] > largest){
            secondLargest = largest;
            largest  = arr[i];
          }else if(arr[i] > secondLargest && arr[i] != largest){
              secondLargest = arr[i];
          }
        }
      System.out.println("Second Largest element: "+ secondLargest);

        sc.close();
    }


}
