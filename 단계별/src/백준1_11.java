import java.util.Scanner;

public class 백준1_11 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long a = s.nextLong(); //10^12까지 입력되므로 int형보다 크다. long(8byte)로 작성해야함
        long b = s.nextLong();
        long c = s.nextLong();
        s.close();
        System.out.println(a+b+c);

    }
    
}
