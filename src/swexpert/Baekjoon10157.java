package swexpert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon10157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] lineForRowCol = br.readLine().split(" ");
        int row = Integer.parseInt(lineForRowCol[0]);
        int col = Integer.parseInt(lineForRowCol[1]);

        int num2Find = Integer.parseInt(br.readLine());

        int[][] seats = new int[col][row];

        int cnt = 0;
        int head = 0;

        int x = col - 1, y = row - 1;

        int xL = row;
        int yL = col;

        while(cnt != row * col){
            if(head % 4 == 0){ // 상
                for(int i = 0; i < yL; i++){
                    seats[x][y] = cnt;
                    y--;
                }
                yL--;
            }else if(head % 4 == 2){ // 하
                for(int i = 0; i < yL; i++){
                    seats[x][y] = cnt;
                    y++;
                }
                yL--;
            }else if(head % 4 == 3){ // 좌
                for(int i = 0; i < xL; i++){
                    seats[x][y] = cnt;
                    x--;
                }
                xL--;
            }else if(head % 4 == 1){ // 우
                seats[x][y] = cnt;
                for(int i = 0; i < xL; i++){
                    x++;
                }
                xL--;
            }

            head++;
        }

        for(int r = 0; r < col; r++){
            System.out.println(Arrays.toString(seats[r]));
        }

    }
}
