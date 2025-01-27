import java.util.*;

public class CharacterRead {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter character string ");

        // in this below line hum indexing jis number se krenge wo us number ka character pick
        // krega and indexing start with 0 (zero)
        char ch = sc. next().charAt(3);
        System.out.println(" The character is: "+ch);
    }
}
