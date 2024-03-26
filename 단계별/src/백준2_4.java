import java.util.Scanner;

public class 백준2_4 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        if(0 < x && 0 < y) {
            System.out.println(1);
        }else if(0 > x && 0 < y) {
            System.out.println(2);
        }else if(0 > x && 0 > y) {
            System.out.println(3);
        }else {
            System.out.println(4);
        }
    }
}
