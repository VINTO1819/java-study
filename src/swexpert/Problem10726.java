package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem10726 {
    private static String toBinary(int num){
        StringBuffer sb = new StringBuffer();
        int n = num, left;
        if(num == 0) return "0";

        while(n >= 1){
            left = n % 2;
            sb.append(left);
            n /= 2;
        }

        sb.reverse(); // 위치 반전
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < t; tc++){
            String[] line = br.readLine().split(" ");
            int num = Integer.parseInt(line[1]), pos = Integer.parseInt(line[0]);
            String binary = toBinary(num);

            System.out.printf("#%d ", tc + 1);
            //System.out.print(binary + " / ");
            if(pos > binary.length()){
                System.out.println("OFF");
                continue;
            }
            int validCnt = 0;
            for(int i = binary.length() - 1; i >= binary.length() - pos; i--){
                if(binary.charAt(i) == '1') validCnt++;
            }
            System.out.println(validCnt >= pos ? "ON" : "OFF");

        }


    }
}
