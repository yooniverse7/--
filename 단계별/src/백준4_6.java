import java.util.Scanner;

public class 백준4_6 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] arr = new int[n];

        //배열에 처음 값을 넣어준다.
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        //값을 m번 바꾸기
        for (int j = 0; j < m; j++) {
            int a = s.nextInt();
            int b = s.nextInt();
            int temp = 0;

            temp = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = temp;
        }
        //배열값 출력
        for (int val : arr) {
            System.out.print(val + " ");
        }
        s.close();
    }
}
