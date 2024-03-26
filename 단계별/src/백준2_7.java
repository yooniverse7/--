import java.util.Scanner;

public class 백준2_7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        //이유는 모르겠지만 계속 틀렸던 문제,, 조건을 자세히 보는게 중요할 것
        if(a != b && a != c && b != c) {
            int max;

            if (a>b){
                if (c>a){
                    max = c;
                }
                else{
                    max = a;
                }
            }else{
                if(c>b){
                    max = c;
                }
                else {
                    max = b;
                }
            }
            System.out.println(max*100);
        }
        else if(a == b && a == c){
            System.out.println(10000 + a * 1000);
        }else{
            if(a == b || a == c) {
                System.out.println(1000 + a*100);
            }else {
                System.out.println(1000 + b*100);
            }    
        }
    }
    
}
