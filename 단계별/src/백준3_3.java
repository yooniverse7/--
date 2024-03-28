import java.util.Scanner;

public class 백준3_3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int result = 0;
        s.close();

        for(int i = 1; i <=a;i++) {
            result +=i;
        }
        System.out.println(result);
    }
    
}
