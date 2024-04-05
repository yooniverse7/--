import java.util.Scanner;

public class 백준6_5 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine().toUpperCase(); //입력 시 대문자로 변경
        int[] arr = new int[26];

        for(int i = 0; i < S.length();i++) {
            for(int j = 65;j<=90;j++) {
                if(S.charAt(i) == j) {
                    arr[j - 65] += 1;
                }
            }
        }
        int maxFrequency = 0; //최대빈도 확인
        int countMax = 0; //최대빈도인 알파벳 개수
        char maxChar = '?'; //최대 빈도 알파벳

        for (int i = 0; i<26; i++) {
            if(arr[i]>maxFrequency) {
                maxFrequency = arr[i];
            }
        }
        for (int i = 0; i<26; i++) {
            if(arr[i] == maxFrequency) {
                countMax++;
                maxChar = (char)('A' + i);
            }
        }
        if(countMax == 1) { //개수가 1개라면 해당 알파벳 출력
            System.out.println(maxChar);
        }
        else { // 개수가 여러개라면 ? 출력
            System.out.println('?');
        }
        

    }
}
