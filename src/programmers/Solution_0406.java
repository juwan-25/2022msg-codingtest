package programmers;

import java.util.Scanner;

public class Solution_0406 {
    public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.next();
        System.out.println("결과 : "+solution(str));

    }
}
