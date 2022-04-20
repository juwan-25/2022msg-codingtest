package programmers;

import java.util.Scanner;

public class Solution_0421 {
    public static String solution(String[] seoul) {
        String answer = "";
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) answer = "김서방은 "+i+"에 있다";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] seoul = new String[num];
        for(int i=0; i<seoul.length; i++)
            seoul[i] = sc.next();
        System.out.println(solution(seoul));
    }
}
