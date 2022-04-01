package programmers;

import java.util.Scanner;

public class Solution_0401 {
    public static long solution(long n) {
        long answer = 0;
        long num = (long) Math.sqrt(n);
        if(n%Math.sqrt(n)==0) answer = (num+1)*(num+1);
        else answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(solution(n));
    }
}
