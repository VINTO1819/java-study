/*
    2021 전공역량강화프로그램 알고리즘
    - Java 입출력 기초 -

    3
    3 4 5 1 3 4 5 1 4 5
    6 7 8 5 4 2 1 5 6 7
    4 5 6 7 2 5 7 6 1 1

    #1 35
    #2 51
    #3 44
*/

package test.io;

// import

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

        /*String str = "학교#학원,도서관/게임방 노래방#영화관";
        StringTokenizer st = new StringTokenizer(str, "#,/ "); // 구분자로 공백, #, Comma, / 사용
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }*/

// code
public class BufReader2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");

            int sum = 0;
            while(st.hasMoreTokens()) sum += Integer.parseInt(st.nextToken());
            System.out.printf("#%d %d\n", i + 1, sum);
        }
    }
}
