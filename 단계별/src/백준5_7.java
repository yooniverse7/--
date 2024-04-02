import java.util.Scanner;

public class 백준5_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt();
        
        for (int i = 0; i<T; i++) {

            int num = s.nextInt();
            String S = s.next(); //nextLine을 쓰면 공백까지 반복됨

            for (int j = 0; j < S.length();j++) {
                for (int k = 0;k<num; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
        
        s.close();
        //이 문제를 너무 어렵게 풀려고 했음..
        //2차원 배열로 풀려고 했으나,
        //각 테스트케이스에 대해 출력하라고 하면
        //입력받고 바로 출력하면 된다는 것을 알게 되었다..
    }
}
