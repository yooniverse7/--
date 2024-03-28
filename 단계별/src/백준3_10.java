import java.util.Scanner;

public class 백준3_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String n = " ";
        String star = "*";

        for(int i = 1; i <= num; i++) {
            System.out.println(n.repeat(num - i)+star.repeat(i));
            //새로운 것을 알아갑니다. repeat -> 문자열 반복출력
        }
        s.close();
    }
    
}
