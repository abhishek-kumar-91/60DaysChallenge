
public class charTrianglePattern {
    public static void main(String[] args){
        int n = 5;
        char a = 'a';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(" " + a);
            }
            System.out.println();
            a++;
        }
    }
}
