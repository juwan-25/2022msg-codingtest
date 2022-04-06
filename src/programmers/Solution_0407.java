package programmers;

import java.util.Scanner;

public class Solution_0407 {
    static String solution(int n) {
        String answer = "";
        String[] str = new String[n];
        for(int i=0; i< str.length; i++){
            if((i+1)%2==0) str[i] = "박";
            else str[i] = "수";
        }
        answer = String.join("",str);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 : ");
        int n = sc.nextInt();;
        System.out.println(solution(n));
    }
}
