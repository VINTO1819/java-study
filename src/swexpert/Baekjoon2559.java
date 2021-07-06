package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line1 = br.readLine().split(" ");
        int days = Integer.parseInt(line1[0]), unit = Integer.parseInt(line1[1]);

        String[] line2 = br.readLine().split(" ");
        int[] records = new int[days];
        for(int i = 0; i < days; i++){ records[i] = Integer.parseInt(line2[i]); }

        int maximum = 0;
        for(int i = 0; i < records.length - unit + 1; i++){
            int sum = 0;
            for(int j = i; j < i + unit; j++){
                System.out.printf("%d + ", records[j]);
                sum += records[j];
            }
            System.out.println();
            if(maximum < sum) maximum = sum;
        }

        System.out.print(maximum);

    }
}
