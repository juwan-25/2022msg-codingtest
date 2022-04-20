package programmers;

import java.util.Scanner;

public class Solution_0420 {
    public static int solution(int left, int right) {
        int answer = 0;
        int cnt;
        for(int i=left; i<=right; i++){
            cnt=0;
            for(int j=1; j<=i; j++){
                if(i%j==0) cnt++;
            }
            if(cnt%2==0) answer+=i;
            else answer-=i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
        System.out.println(solution(left,right));
    }
}
