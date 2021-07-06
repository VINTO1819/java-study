package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem1289 {
    private static void setMem(int[] arr, int pos, int val){
        for(int i = pos; i < arr.length; i++){
            arr[i] = val;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int tc = 0; tc < T; tc++){
            String origMemStr = br.readLine();
            int[] recoverTo = new int[origMemStr.length()];
            for(int cl = 0; cl < recoverTo.length; cl++) recoverTo[cl] = Integer.parseInt(origMemStr.substring(cl, cl + 1));

            int[] mem = new int[origMemStr.length()]; Arrays.fill(mem, 0);

            int editCnt = 0;
            for(int p = 0; p < mem.length; p++){
                if(mem[p] != recoverTo[p]){
                    setMem(mem, p, recoverTo[p]);
                    editCnt++;
                }
            }
            System.out.printf("#%d %d\n", tc + 1, editCnt);
        }
    }
}
