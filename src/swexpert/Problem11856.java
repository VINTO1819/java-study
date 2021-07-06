/*
    2021 전공역량강화프로그램 알고리즘
    - Java 기초 -
*/

package swexpert;

// import
import java.util.Scanner;

// code
public class Problem11856 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();

        for(int tc = 0; tc < times; tc++){
            String str = sc.nextLine();

            int cntArr[] = new int[26];
            for(int i = 0; i < 26; i++) cntArr[i] = 0;

            for(int i = 0; i < str.length(); i++){
                cntArr[str.charAt(i) - 65]++;
            }

            int kindCnt = 0;
            int sum = 0;

            for(int i = 0; i < 26; i++){
                if(0 < cntArr[i]){
                    kindCnt++;

                    sum += cntArr[i];
                }
            }

            System.out.printf("#%d ", tc + 1);
            System.out.println(
                    (kindCnt == 2 && sum == 2 * 2) ?
                            "Yes" : "No"
            );


        }


    }
}
