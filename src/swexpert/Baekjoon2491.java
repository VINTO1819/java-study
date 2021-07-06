package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Baekjoon2491 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(br.readLine());
        String[] rawArr = br.readLine().split(" ");
        int[] arr = new int[len]; for(int i = 0; i < len; i++) arr[i] = Integer.parseInt(rawArr[i]);

        ArrayList<Integer> lenList = new ArrayList<Integer>();
        int currentLength = 0;
        int lastNum = 0;
        for(int i = 0; i < len; i++){
            if(arr[i] > lastNum || arr[i] == lastNum) {
                lastNum = arr[i];
            }else{
                //System.out.println("End!");
                lenList.add(currentLength);
                currentLength = 0;
                lastNum = arr[i];
            }
            currentLength++;
            //System.out.printf("%d -> ", arr[i]);
        }
        lenList.add(currentLength);
        //System.out.println("End!\n");
        currentLength = 0;

        lastNum = 0;
        for(int i = len - 1; i >= 0; i--){
            if(arr[i] > lastNum || arr[i] == lastNum) {
                lastNum = arr[i];
            }else{
                //System.out.println("End!");
                lenList.add(currentLength);
                currentLength = 0;
                lastNum = arr[i];
            }
            currentLength++;
            //System.out.printf("%d -> ", arr[i]);
        }
        lenList.add(currentLength);
        //System.out.println("End!\n");

        lenList.sort(Comparator.reverseOrder());
        //System.out.printf("%s", Arrays.toString(lenList.toArray()));
        System.out.print(lenList.get(0));
    }
}
