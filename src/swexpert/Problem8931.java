package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem8931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < t; tc++){
            Stack<Integer> stack = new Stack<>();
            int recordAmount = Integer.parseInt(br.readLine());
            for(int m = 0; m < recordAmount; m++){
                int money = Integer.parseInt(br.readLine());
                if(money == 0){
                    stack.pop();
                }else{
                    stack.push(money);
                }
            }

            int sum = 0;
            while(!stack.empty()) sum += stack.pop();
            System.out.printf("#%d %d\n", tc + 1, sum);
        }
    }
}
