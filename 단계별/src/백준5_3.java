import java.util.Scanner;

public class 백준5_3 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        s.nextLine();
        char[][] arr = new char[T][1000];


        //2차원 배열을 생성해서 각 라인별로 문자열을 넣어주기
        for (int i = 0; i < T; i++) {
            String a = s.nextLine();
            arr[i] = a.toCharArray(); 
        }

        //처음과 끝 문자만 출력하기
        for (int i = 0; i < T; i++) {
            int length = arr[i].length;
            char b = arr[i][0];
            char c = arr[i][length-1];
            System.out.print(b);
            System.out.println(c);
        }
        s.close();

        
    }
}
