import java.util.Scanner;

public class 백준4_7 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[30];

        //순서대로 배열 해당위치에 입력값 담기
        for (int i = 0; i < 28; i++) {
            int a = s.nextInt();
            arr[a-1] = a; 
        }
        
        for (int j = 0; j <30; j++) {
            if(arr[j] == 0) {
                System.out.println(j+1);
            }
        }
        s.close();
        //이해 못했던 점 : 인덱스 내에 값이 없으면 0이다.
    }
}
