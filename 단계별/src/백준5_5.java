import java.util.Scanner;

public class 백준5_5 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        int[] arr = new int[n];
        String a = s.nextLine();
        
        

        for (int i = 0; i < n; i++) {
            char c = a.charAt(i); // 문자열에서 i번째 문자 추출
            arr[i] = Character.getNumericValue(c); //문자를 정수로 변환해서 배열에 저장
        }

        int sum = 0;
        for (int i = 0; i < n; i++) { //합 구하기
            sum +=arr[i];
        }

        System.out.println(sum);
        s.close();
    }
}
