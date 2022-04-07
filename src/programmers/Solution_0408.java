package programmers;

import java.util.Scanner;

public class Solution_0408 {
    static int solution(int n) {
        int answer = 0;
        while(n>=10){
            answer += n%10;
            n/=10;
        }
        answer+=n;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 : ");
        int num = sc.nextInt();
        System.out.println(solution(num));
    }
}
