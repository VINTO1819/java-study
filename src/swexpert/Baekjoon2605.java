package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2605 {
    private static void push(int[] arr, int pos){
        for(int i = arr.length - 1; i > pos; i--){
            int tmp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = tmp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int stuAmount = Integer.parseInt(br.readLine());
        int[] students = new int[stuAmount]; Arrays.fill(students, -1);
        String[] items = br.readLine().split(" ");

        for(int i = 0; i < stuAmount; i++){
            int upward = Integer.parseInt(items[i]);
            if(students[i - upward] == -1){
                students[i - upward] = i + 1;
            }else{
                push(students, i - upward);
                //int tmp = students[i - upward];
                students[i - upward] = i + 1;
                //students[i] = tmp;
            }
        }

        for(int i = 0; i < stuAmount; i++) System.out.printf("%d ", students[i]);
    }
}
