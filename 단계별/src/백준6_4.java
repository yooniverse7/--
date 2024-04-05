import java.util.Scanner;

public class 백준6_4 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();
        
        StringBuilder reversed = new StringBuilder();

        for(int i = S.length()-1; i>=0;i--) { //역순정렬
            reversed.append(S.charAt(i));
        }
        
        if (S.equals(reversed.toString())) { //비교
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
