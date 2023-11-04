public class FindElementInArray{
    public static void main(String[] args){
        int [] arr = {1,5,6,8,9,8,93};
        int x = 93;
        boolean result  = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
               result = true;
            }
        }
            if(result){
                     System.out.println("Element found: ");
            }else{
                    System.out.println("Element not found!!!!");
            }
        
    }
}