import java.util.Scanner;

public class arraySum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int sum = 0;
                
        for(int i = 0; i< size; i++){
                System.out.println("Enter the elements: ");
                arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            sum += arr[i];
        }

        System.out.println("Sum: "+ sum);

        sc.close();
    }
}