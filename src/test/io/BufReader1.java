/*
    2021 전공역량강화프로그램 알고리즘
    - Java 입출력 기초 -
*/

package test.io;

// import
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// code
public class BufReader1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String name;
        int age;
        float height;
        double weight;
        char gender;

        System.out.print("이름 : "); name = br.readLine();
        System.out.print("나이 : "); age = Integer.parseInt(br.readLine());
        System.out.print("키 : "); height = Float.parseFloat(br.readLine());
        System.out.print("무게 : "); weight = Double.parseDouble(br.readLine());
        System.out.print("성별 : "); gender = br.readLine().charAt(0);

        System.out.println();

        System.out.println(String.format("이름 : %s", name));
        System.out.println(String.format("나이 : %d세", age));
        System.out.println(String.format("키 : %.1fcm", height));
        System.out.println(String.format("무게 : %.1fkg", weight));
        System.out.println(String.format("성별 : %c성", gender));
    }
}
