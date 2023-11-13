import java.util.Scanner;
public class averageOfArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        float averageAns;
        int sum = 0;

        for(int i = 0; i < size; i++){
            System.out.println("Enter the elemeent: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        averageAns = sum /size;
        System.out.println("ANs: "+ averageAns);

        sc.close();
    }
}
