package programmers;

import java.util.Scanner;

public class Solution_0414 {
    public static int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++)
            if(n%i==0) answer+=i;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));
    }
}

