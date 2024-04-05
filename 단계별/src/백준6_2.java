import java.util.Scanner;

public class 백준6_2 {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[6];
        int[] arr1 = new int[6];

        for (int i = 0; i<6; i++) {
            arr[i] = s.nextInt();
        }
        s.close();

        for (int i = 0; i<6; i++) {
            arr1[i] = 0;
        }
        if (arr[0] != 1){
            arr1[0] = -(arr[0]-1); 
        }
        if (arr[1] != 1){
            arr1[1] = -(arr[1]-1); 
        }
        if (arr[2] != 2){
            arr1[2] = -(arr[2]-2);
        }
        if (arr[3] != 2){
            arr1[3] = -(arr[3]-2);
        }
        if (arr[4] != 2){
            arr1[4] = -(arr[4]-2);
        }
        if (arr[5] != 8){
            arr1[5] = -(arr[5]-8);
        }

        for (int i:arr1) {
            System.out.print(i + " ");
        }
        s.close();
    }
}
