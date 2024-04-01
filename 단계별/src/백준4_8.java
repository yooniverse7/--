import java.util.Scanner;

public class 백준4_8 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[42];

        // 배열을 -1로 초기화
        for (int i = 0; i < 42; i++) {
            arr[i] = -1;
        }

        //각 수의 나머지값 저장
        //배열의 크기를 42로 두고 인덱스번호와 나머지가 같은 곳에 저장
        for (int i = 0; i < 10; i++) {
            int a = s.nextInt() % 42;
            arr[a] = a;
        }
        //서로 다른 나머지가 몇 개인지 세기
        int count = 0;
        for (int j = 0; j < 42; j++) {

            //-1이 아닌 인덱스 개수 세기
            if(arr[j] != -1) {
                count++;
            }
        }
        System.out.println(count);
        s.close();


        //왜 어려웠냐면
        //나머지가 0이라서 저장된 것과 인덱스에 아무 값이 없어서 
        //0으로 인식되는 것에 차이를 둬야했음...
    }
}
