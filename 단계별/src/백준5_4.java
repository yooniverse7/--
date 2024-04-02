import java.util.Scanner;

public class 백준5_4 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0); //문자 입력받기
        int num = (int)a; //문자 -> 아스키코드 변환

        System.out.println(num);
        s.close();
    }
}
