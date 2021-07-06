/*
    2021 전공역량강화프로그램 알고리즘
    - 12004번 삼성SW Expert 문제 -
*/

package swexpert;

// import
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// code
public class Problem12004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int testCase = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < testCase; tc++){
            int n = Integer.parseInt(br.readLine());

            int i1, i2;
            boolean success = false;
            for(i1 = 1; i1 <= 9; i1++){
                for(i2 = 1; i2 <= 9; i2++){
                    if(i1 * i2 == n) success = true;
                }
            }

            System.out.println(String.format("#%d %s", tc + 1, success ? "Yes" : "No"));
        }

    }
}
