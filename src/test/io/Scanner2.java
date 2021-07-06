/*
    2021 전공역량강화프로그램 알고리즘
    - Java 입출력 기초 -

    3
    3 4 5 1 3 4 5 1 4 5
    6 7 8 5 4 2 1 5 6 7
    4 5 6 7 2 5 7 6 1 1

    #1 35
    #2 51
    #3 44
*/

package test.io;

// import
import java.util.Scanner;

// code
public class Scanner2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*String str = "2 4 5 1 3 4 5 1 4 5";
        String[] tokened = str.split(" ");
        for(int i = 0; i < tokened.length; i++){
            System.out.println(tokened[i]);
        }*/

        int T = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < T; i++){
            String line = sc.nextLine();
            String[] tokenArr = line.split(" ");
            int sum = 0;

            for(int j = 0; j < 10; j++){
                sum += Integer.parseInt(tokenArr[j]);
            }

            System.out.printf("#%d %d\n", i + 1, sum);
        }

    }
}
