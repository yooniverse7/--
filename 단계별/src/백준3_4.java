import java.util.Scanner;

public class 백준3_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = s.nextInt();
        int num = s.nextInt();
        int result = 0;

        int[] arr1 = new int[num];
        int[] arr2 = new int[num];

        for (int i = 0; i < num; i++) {
            arr1[i] = s.nextInt();
            arr2[i] = s.nextInt();
            s.close();
        }
        for (int j = 0; j < num; j++) {
            result = result + (arr1[j] * arr2[j]);
        }

        if (result == sum) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}
