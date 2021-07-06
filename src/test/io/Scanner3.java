/*
    2021 전공역량강화프로그램 알고리즘
    - Java 입출력 기초 -

    5
    3 7
    5 4
    9 10
    2 -1
    8 6

    #1 7
    #2 5
    #3 10
    #4 1
    #5 8
*/

package test.io;

// import
import java.util.Scanner;

// code
public class Scanner3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); sc.nextLine();

        for(int i = 0; i < T; i++){
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            sc.nextLine();
            int max = n1 > n2 ? n1 : n2;
            System.out.printf("#%d %d\n", i + 1, max);
        }
    }
}
