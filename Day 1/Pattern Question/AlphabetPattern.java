
public class AlphabetPattern {
    public static void main(String[] args){
        int a = 97;
        int n = 5;

    for(int i = 1; i <= n; i++){
        for(int j = 1; j <= n; j++){
            char c = (char) a;
            System.out.print(" "+  c);
        }
        System.out.println();
        a++;
    }
    }
    
}
