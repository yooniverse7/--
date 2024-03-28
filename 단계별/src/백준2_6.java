import java.util.Scanner;

public class 백준2_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int m = s.nextInt();
        int c = s.nextInt();

        if((m + c) < 60) {
            System.out.println(h + " " + (m+c));
        }else  {
            int min;
            min = (m + c) % 60 ;
            h = h + (m + c)/60 ;
            if(h > 23) {
                h = h - 24; //여기서 자꾸 틀림 -> h가 if 안에 있어서 바깥으로 나가면 -24한 값으로 출력이 안되는줄 알고 if 안에 출력을 한번 더 찍었더니 두번 찍힘 
                //그래서 if 내의 출력을 지웠는데도 바깥의 print에서 -24가 된 값으로 잘만 찍힘;
            }
            System.out.println(h + " " + min);
        
        }
        s.close();
    }
}
