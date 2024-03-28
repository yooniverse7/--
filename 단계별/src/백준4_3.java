import java.util.Arrays;
import java.util.Scanner;

public class 백준4_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[num - 1]);
    s.close();
    }
    //알게 된 사실 : 정렬 시, Arrays.sort(arr); 이렇게 쓰면 매우 유용
    //사실2 : System.out.println(Arrays.toString(arr)); 이렇게 쓰면 전체 요소 다 출력
}
