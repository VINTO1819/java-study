/*
    2021 전공역량강화프로그램 알고리즘
    - Java 입출력 기초 -


*/

package test.io;

// import

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

// code
public class BufReader3 {
    private static int square(int num, int cur, int times){
        if(times == 0) return cur;
        return square(num, cur * num, times - 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int tc = 0; tc < 10; tc++){
            int caseId = Integer.parseInt(br.readLine());
            String[] line = br.readLine().split(" ");
            int num = Integer.parseInt(line[0]);
            int sq = Integer.parseInt(line[1]);

            int result = square(num, 1, sq);
            System.out.println(String.format("#%d %d", caseId, result));
        }
    }
}
