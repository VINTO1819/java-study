/*
    2021 전공역량강화프로그램 알고리즘
    - Java 기초 -
*/

package test.basic;

// import

// code
public class BasicOutput {
    public static void main(String[] args){
        final String name = "홍길동";
        final int age = 17;
        final float weight = 67.5f;
        final boolean gender = true;
        final float height = 175.5f;

        System.out.print("나의 이름은 " + name +" 입니다\n");
        System.out.print("나의 나이는 " + age + "세 입니다\n");
        System.out.print("나의 체중은 " + weight + "kg 입니다\n");
        System.out.print("나의 성별은 " + (gender ? "남" : "여") + "성 입니다\n");
        System.out.print("나의 키은 " + height + "cm 입니다\n");


    }
}
