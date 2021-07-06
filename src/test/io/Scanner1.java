/*
    2021 전공역량강화프로그램 알고리즘
    - Java 입출력 기초 -
*/

package test.io;

// import

import java.util.Scanner;

// code
public class Scanner1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        float height;
        double weight;
        char gender;

        System.out.print("이름 : "); name = sc.next();
        System.out.print("나이 : "); age = sc.nextInt();
        System.out.print("키 : "); height = sc.nextFloat();
        System.out.print("무게 : "); weight = sc.nextDouble();
        System.out.print("성별 : "); gender = sc.next().charAt(0);

        System.out.println();

        System.out.println(String.format("이름 : %s", name));
        System.out.println(String.format("나이 : %d세", age));
        System.out.println(String.format("키 : %.1fcm", height));
        System.out.println(String.format("무게 : %.1fkg", weight));
        System.out.println(String.format("성별 : %c성", gender));


    }
}
