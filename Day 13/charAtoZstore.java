
public class charAtoZstore {
    public static void main(String[] args){
        char [] alphabate = new char[27];
        int alpha = 97;
        for(int i = 1; i < 27; i++){
            alphabate[i] = (char) alpha;
            alpha++;
        }

        for(int i = 0; i < alphabate.length ; i++){
            System.out.println(alphabate[i]);
        }
    }
}
