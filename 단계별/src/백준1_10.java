import java.util.Scanner;

public class 백준1_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        s.close();
        int c = b%10; // b의 1의 자리
        int d = b%100;
        int e = (d - c)/10; //b의 10의 자리
        int f = (b - d)/100; //b의 100의 자리
        System.out.println(a*c);
        System.out.println(a*e);
        System.out.println(a*f);
        System.out.println(a*b);

    }
    
}
