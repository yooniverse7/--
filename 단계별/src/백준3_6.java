import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준3_6 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = Integer.parseInt(bf.readLine());
        int[] arr1 = new int[sum];
        int[] arr2 = new int[sum];

        // 입력 받기
        for(int i = 0; i < sum; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            arr1[i] = Integer.parseInt(st.nextToken()); //스페이스바를 한번 쓰려면 token을 써야한다고 한다
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        // 결과 출력
        for (int j = 0; j < sum; j++) {
            bw.write(String.valueOf(arr1[j] + arr2[j]));
            bw.newLine(); // 개행 문자 추가
        }
        
        // BufferedWriter 닫기
        bw.flush();
        bw.close();
    }
    //이거 쓰는 방법을 몰라서 꽤 까다로웠음..여전히 왜쓰는지는 잘,,
}
