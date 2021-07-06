/*
    2021 전공역량강화프로그램 알고리즘
    - Java 기초 문제 -

    [문제] 다음과 같이 완성하시오
     각각 변수를 만들어 값을 대입한후 결과를 출력하시오
     단, println을 한번만 이용해서 작성하시오

    -출력-
    나의 이름은 강호동이며 성별은 남자이고 입사성적은 85.35점 입니다
*/

package test.basic;

// code
public class Test1 {
    public static void main(String[] args){
        final String name = "강호동";
        final boolean gender = true;
        final float score = 85.35f;

        String str2Print = String.format("나의 이름은 %s이며 성별은 %s이고 입사성적은 %.2f점 입니다",
                name, gender ? "남자" : "여자", score);
        System.out.println(str2Print);
    }
}
