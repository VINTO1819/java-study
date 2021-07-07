package selfstudy;

import java.util.Arrays;
import java.util.Comparator;

// 15,000,000 크기를 지닌 배열에서의 일반적인 순회 탐색법과 이분 탐색법 성능 비교
public class BinarySearch {
    private static class Result {
        int normal, binary;

        Result(int n, int b){
            normal = n;
            binary = b;
        }
    }

    private static int binarySearch(Integer[] numbers, int toFind){
        int left = 0, center = 0, right = numbers.length - 1;

        while(left <= right){
            center = (left + right) / 2;

            if(numbers[center] == toFind){
                return center;
            }else if(toFind < numbers[center]){ // 값이 좌측에 위치
                right = center - 1;
            }else if(numbers[center] < toFind) { // 값이 우측에 위치
                left = center + 1;
            }
        }
        return -1;
    }

    private static Result test(Integer[] numbers) throws InterruptedException {
        int toFind = numbers[(int)(Math.random() * numbers.length)];
        System.out.printf("찾을 값 : %d\n", toFind);

        System.out.println("일반 탐색 카운트다운 시작");
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        long startedMsNormal = System.currentTimeMillis();
        long takenNoraml = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == toFind) {
                takenNoraml = System.currentTimeMillis() - startedMsNormal;
                System.out.printf("%d를 %d에서 발견했습니다!\n * 소요 시간 : %dms\n\n", toFind, i, takenNoraml);
                break;
            }
        }
        Thread.sleep(3000);

        System.out.println("이분 탐색 카운트다운 시작");
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        long startedMsBinary = System.currentTimeMillis();
        int foundAt = binarySearch(numbers, toFind);
        long takenBinary = System.currentTimeMillis() - startedMsBinary;
        System.out.printf("%d를 %d에서 발견했습니다!\n * 소요 시간 : %dms\n\n", toFind, foundAt, takenBinary);

        System.out.println("\n=====================\n");

        return new Result((int) takenNoraml, 0);
    }

    public static void main(String[] args) throws Exception {
        Integer[] numbers = new Integer[15000000];
        System.out.println("Creating Array..");
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * Integer.MAX_VALUE);
        }

        System.out.println("Sorting Array..");
        Arrays.sort(numbers, Comparator.naturalOrder());
        System.out.println("Sorting Finished!\n");

        final int testTime = 10;
        double normal = 0;
        double binary = 0;
        for(int t = 0; t < testTime; t++){
            Result result = test(numbers);
            normal += result.normal;
            binary += result.binary;
        }

        normal = normal / (double)testTime;
        binary = binary / (double)testTime;

        System.out.println("");
        System.out.println("알고리즘 성능비교 평균 :");
        System.out.printf(" * 일반 : %fms\n", normal);
        System.out.printf(" * 이분 : %fms\n", binary);
    }
}
