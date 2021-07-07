package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10912 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < t; tc++){
            String input = br.readLine();
            int[] counter = new int[26];
            for(int c = 0; c < input.length(); c++) counter[input.charAt(c) - 97]++;

            System.out.printf("#%d ", tc + 1);
            int illCnt = 0;
            for(int i = 0; i < 26; i++){
                if(counter[i] % 2 != 0 && counter[i] != 0){
                    illCnt++;
                    System.out.print((char)(i + 97));
                }
            }
            if(illCnt == 0) System.out.print("Good");

            System.out.println();
        }


    }
}