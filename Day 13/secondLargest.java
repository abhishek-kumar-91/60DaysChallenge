public class secondLargest {
    public static void main(String[] args){
        int[] arr= {55,88,66,83,99,63};
        int maxValue = Integer.MIN_VALUE;
        int idx = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
                idx = i;
            }
        }

        arr[idx] = 0;
        maxValue = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        System.out.println(maxValue);
    }
}
