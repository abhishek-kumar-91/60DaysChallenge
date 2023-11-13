import java.util.Scanner;
public class FindElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = {4,5,6,8,9,7,86,3,56,53,5,63,5};
        System.out.println("Enter the elements : ");
        int e = sc.nextInt();
        int result = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == e){
                result = i;
                break;
            }
        }

        if(result == -1){
            System.out.println(result);

        }else{
            System.out.println(result);
        }

    }
}
