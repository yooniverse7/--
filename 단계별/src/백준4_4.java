import java.util.Scanner;

public class 백준4_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[9];
        int a = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = s.nextInt();
        }
        int max = arr[0];

        for (int j = 1; j < 9; j++) {
            if(max < arr[j]) {
                max = arr[j];
            }
        }

        for (int z = 0; z < 9; z++) {
            if(max == arr[z]) {
                a = z;
            }
        }
        System.out.println(max);
        System.out.println(a+1);
        s.close();
    }
    
}
