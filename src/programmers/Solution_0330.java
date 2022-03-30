package programmers;

import java.util.Scanner;

public class Solution_0330 {
    static double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++)
            sum += arr[i];
        answer = (double) sum/ arr.length;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력 개수");
        int[] arr = new int[sc.nextInt()];
        for(int i=0; i< arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.println(solution(arr));
    }
}
