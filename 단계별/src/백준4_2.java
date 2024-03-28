import java.util.Scanner;

public class 백준4_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        for (int j = 0; j < n; j++) {
            if(arr[j] < x) {
                System.out.print(arr[j] + " ");
            }
        }
        s.close();
    }
    //알게 된 사실
    // println은 줄바꿈해서 출력하고 print는 줄바꿈없이 출력

}
