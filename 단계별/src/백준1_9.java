import java.util.Scanner;

public class 백준1_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        s.close();

        System.out.println((a+b)%c);
        System.out.println(((a%c)+(b%c))%c);
        System.out.println((a*b)%c);
        System.out.println(((a%c)*(b%c))%c);
    }
    
}
