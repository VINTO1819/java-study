package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1208 {
    private static boolean isFlat(int[] arr){
        boolean flat = true;
        int val = arr[0];
        for(int i = 0; i < arr.length; i++){
            if (val != arr[i]) {
                flat = false;
                break;
            }
        }
        return flat;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int tc = 0; tc < 10; tc++){ // 10개의 test-case
            int chances = Integer.parseInt(br.readLine());
            String[] tokens = br.readLine().split(" ");

            // init array
            int[] blocksHeight = new int[tokens.length];
            for(int i = 0; i < tokens.length; i++) blocksHeight[i] = Integer.parseInt(tokens[i]);

            int maxIndex = 0, minIndex = 0;
            while(chances > 0 && !isFlat(blocksHeight)) {
                for(int i = 0; i < blocksHeight.length; i++){
                    if(blocksHeight[maxIndex] < blocksHeight[i]) maxIndex = i;
                    if(blocksHeight[minIndex] > blocksHeight[i]) minIndex = i;
                }

                // swap this
                blocksHeight[maxIndex]--;
                blocksHeight[minIndex]++;
                chances--;
            }

            for(int i = 0; i < blocksHeight.length; i++){
                if(blocksHeight[maxIndex] < blocksHeight[i]) maxIndex = i;
                if(blocksHeight[minIndex] > blocksHeight[i]) minIndex = i;
            }

            int maxHeight = blocksHeight[maxIndex];
            int minHeight = blocksHeight[minIndex];
            System.out.printf("#%d %d\n", tc + 1, maxHeight - minHeight);
        }
    }
}
