import java.util.Scanner;

public class 백준5_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[26];

        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        String a = s.nextLine();

        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if(arr[c - 'a'] == -1) { //a의 아스키코드 값이 97이고 만약 c가 'a'라면 0이 나옴
                arr[c - 'a'] = i;
            }
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
        s.close();

        //무지성으로 코딩하지말자,,
    }
   
}
