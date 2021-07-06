/*
    2021 전공역량강화프로그램 알고리즘
    - Java 타입캐스팅 -
*/

package test.basic;

// code
public class TypeCasting {
    public static void main(String[] args){
        int a = 100;
        long b = a; // int -> long (auto casting)

        double c = 50;
        int d = (int)c; // double은 int보다 더 커서 auto casting으로는 안들어감

        int salary = 857650; // 급여
        double taxRatio = 0.033; // 세율

        int result = salary - (int)(salary * taxRatio);
        System.out.println(String.format("세전 급여 : %d원\n세후 급여 : %d원", salary, result));

        int k = 87, e = 88, m = 75;
        int sum = k + e + m;

        double avg1 = (double)sum / 3; // 강제 형변환
        System.out.println(avg1);

        double avg2 = sum / 3.0;
        System.out.println(avg2);

    }
}
