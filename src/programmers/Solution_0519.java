package programmers;

import java.util.Scanner;

public class Solution_0519 {
    public static String solution(String s) {
        String answer = "";
        int index = s.length()/2;
        if(s.length()%2==0) {
            answer += s.charAt(index-1);
            answer += s.charAt(index);
        } else {
            answer += s.charAt(index);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        System.out.println(solution(s));

    }
}
