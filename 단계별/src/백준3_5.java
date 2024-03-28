import java.util.Scanner;

public class 백준3_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int result = a/4;
        String sum = "long ";
        s.close();

        if(result == 1) {
            System.out.println(sum + "int");
        }else {
            for (int i = 2; i <=result; i++) {
                sum = sum + "long ";
            }
            System.out.println(sum + "int");
        }

    }
    
}
