/*
    2021 전공역량강화프로그램 알고리즘
    - Java parseInt 예제 -
*/

package test.basic;

// code
public class ParsingInteger {
    public static void main(String[] args){
        String a = "100";
        String b = "200";

        String exception = "wow124"; // if use this, parseInt will throw an exception!

        System.out.println(a + b);

        int ia = Integer.parseInt(a);
        int ib = Integer.parseInt(b);
        System.out.println(ia + ib);

    }
}
