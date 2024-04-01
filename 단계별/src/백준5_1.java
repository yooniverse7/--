import java.util.Scanner;

public class 백준5_1 {

    //문자열 배열에 넣는 방법을 알게된 문제
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char[] arr = a.toCharArray(); //이거 기억하기

        int i = s.nextInt();

        System.out.println(arr[i-1]);
        s.close();

    }
}
