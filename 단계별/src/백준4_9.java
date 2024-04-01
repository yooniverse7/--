import java.util.Scanner;

public class 백준4_9 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] arr = new int[n];

        //값 채우기
        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        //역순으로 정렬하기.. 이 부분에서 실패해버리고 말았음.. 
        for (int i = 0; i < m; i++) {
            int a = s.nextInt() -1 ;
            int b = s.nextInt() -1;

            while(a < b) { // 이 부분,, 역순. if는 한번만 배열을 바꾸므로 while을 사용해야한대
                int temp = arr[a];
                arr[a++] = arr[b];
                arr[b--] = temp;    
            }

        }
        s.close();

        for(int j:arr) {
            System.out.print(j + " ");
        }
    }
}
