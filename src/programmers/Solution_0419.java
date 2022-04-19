package programmers;

import java.util.Scanner;

public class Solution_0419 {
    public static int solution(int[] numbers) {
        int answer = 0;
        boolean[] cnt = new boolean[10];
        for(int a:numbers)
            cnt[a] = true;
        for(int i=0; i<cnt.length; i++) {
            if(cnt[i]==false) answer += i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numbers = new int[num];
        for(int i=0; i<numbers.length; i++)
            numbers[i] = sc.nextInt();
        System.out.println(solution(numbers));
    }
}
