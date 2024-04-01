import java.util.Scanner;

public class 백준4_10 {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];

        //값 입력받기
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        //최대값 구하기
        int max = arr[0];
        for(int i = 1; i<n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        float avg = 0;

        //평균구해서 출력하기
        for(int j = 0; j<n; j++) {
            avg += (float)arr[j]/max*100; //나눗셈 연산 시 실수로 나오고 싶다면 실수형을 붙여줘야함
        }
        System.out.println(avg/n);
        s.close();



    }
}
