import java.util.Scanner;
import java.util.StringTokenizer;

public class 백준5_8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();
        StringTokenizer st = new StringTokenizer(S, " ");
        s.close();

        System.out.println(st.countTokens());
    }
}
