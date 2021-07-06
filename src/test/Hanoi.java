package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Hanoi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ringAmount = Integer.parseInt(br.readLine());
        int[][] hanoi = new int[3][ringAmount];
        for(int i = 0; i < ringAmount; i++){
            hanoi[0][ringAmount - 1 - i] = i + 1;
        }



        for(int i = 0; i < ringAmount; i++)
            System.out.println(Arrays.toString(hanoi[i]));


    }
}
