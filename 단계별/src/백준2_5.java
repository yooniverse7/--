import java.util.Scanner;

public class 백준2_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int h = s.nextInt();
        int m = s.nextInt();
        s.close();

        if (m < 45) {
            h--;
            m = 60 - (45 -m);

            if(h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        }
        else {
            System.out.println(h + " " + (m - 45));
            
        }
    }
}
