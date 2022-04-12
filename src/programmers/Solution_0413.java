package programmers;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution_0413 {
    public static boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int[] arr = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        for(int i=0; i< arr.length; i++)
            sum += arr[i];
        if(x%sum==0) return answer;
        else answer = false;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(solution(num)) System.out.println("하샤드 수입니다.");
        else System.out.println("하샤드 수가 아닙니다.");
    }
}

