import java.util.Scanner;

public class 백준3_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            int b = s.nextInt();
            int c = s.nextInt();
            arr[i] = b + c;
        }
        for(int result : arr) {
            System.out.println(result);
        }
    }
    
}
