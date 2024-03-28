import java.util.Scanner;

public class 백준4_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = 0;
        }
        
        for(int j = 0; j < m; j++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int c = s.nextInt();
            for(int x = a - 1; x <= b - 1; x++) { // 수정된 부분: 범위에 시작점과 끝점을 포함시킴
                arr[x] = c;
            }
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
        s.close();
    }
}
