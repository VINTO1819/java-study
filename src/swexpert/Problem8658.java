package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem8658 {
    private static Integer[] splitNumber(int num){
        int unit = 1;
        Stack<Integer> stack = new Stack<>();
        while(num / unit > 0){
            stack.push(num / unit);
            unit *= 10;
        }

        Integer[] arr = new Integer[stack.size()];
        int i = 0;
        while(!stack.empty()){
            arr[i] = stack.pop() % 10;
            i++;
        }

        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < t; tc++){
            String[] line = br.readLine().split(" ");
            Integer[] numArr = new Integer[10]; for(int i = 0; i < 10; i++) numArr[i] = Integer.parseInt(line[i]);

            int maxIndex = 0, minIndex = 0;
            for(int ni = 0; ni < numArr.length; ni++) {
                Integer[] splitted = splitNumber(numArr[ni]);
                int sum = 0; for(int itn : splitted) sum += itn;
                numArr[ni] = sum;

                if(numArr[maxIndex] < sum) maxIndex = ni;
                if(numArr[minIndex] > sum) minIndex = ni;
            }

            System.out.printf("#%d %d %d\n", tc + 1, numArr[maxIndex], numArr[minIndex]);
        }
    }
}
