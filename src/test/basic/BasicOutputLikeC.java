/*
    2021 전공역량강화프로그램 알고리즘
    - Java 기초 -
*/

package test.basic;

// import

// code
public class BasicOutputLikeC {
    public static void main(String[] args){
        final String name = "홍길동";
        final int age = 17;
        final float weight = 67.5f;
        final boolean gender = true;
        final float height = 175.5f;

        System.out.printf("나의 이름은 %s 입니다\n", name);
        System.out.printf("나의 나이는 %d세 입니다\n", age);
        System.out.printf("나의 체중은 %.1fkg 입니다\n", weight);
        System.out.printf("나의 성별은 %s성 입니다\n", gender ? "남" : "여");
        System.out.printf("나의 키은 %.1fcm 입니다\n", height);


    }
}
