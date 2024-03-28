import java.util.Scanner;

public class 백준4_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        int count = 0;
        
        for (int i = 0; i < num; i++) { //배열에 값을 할당할 때는 int i:arr 이런식으로 적으면 안됨
            arr[i] = s.nextInt();
        }
        int a = s.nextInt();

        for(int j : arr) { //배열값에 접근할 때는 이렇게 하면 쉬움
            if(j == a) {
                count++;
            }
        }
        System.out.println(count);

        s.close();

    }
    
}
