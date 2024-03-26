import java.util.Scanner;

public class 백준2_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int m = s.nextInt();
        int c = s.nextInt();

        if((m + c) < 60) {
            System.out.println(h + " " + (m+c));
        }else if((m + c) > 60 && (m + c) < 120) {
            m = (m + c) - 60;
            h ++ ;
            if(h > 23) {
                h = h - 24;
                System.out.println(h + " " + m);
            }
            System.out.println(h + " " + m);
        }else {
            m = (m + c) % 60;
            
        }
    }
}
