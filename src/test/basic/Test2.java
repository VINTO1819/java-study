/*
    2021 전공역량강화프로그램 알고리즘
    - Java 기초 문제 -

    [문제] 각각 변수를 만들어 다음과 같이 완성하시오
        println으로 각각 출력하시오

    이름 : 강호동
    국어 : 85
    영어 : 73
    수학 : 68
    총점 : 226점
    평균 : 75.33점
*/

package test.basic;

// code
public class Test2 {
    public static void main(String[] args){
        final String name = "강호동";
        final short korean = 85;
        final short english = 73;
        final short math = 68;
        final short sum = korean + english + math;
        final float avg = sum / 3.0f;

        System.out.printf("이름 : %s\n국어 : %d\n영어 : %d\n수학 : %d\n총점 : %d\n평균 : %.2f", name, korean, english, math, sum, avg);
    }
}
