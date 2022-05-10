package programmers;

import java.util.Scanner;

public class Solution_0511 {
    public static int solution(String s) {
        int answer=0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for(int i=0; i<arr.length; i++)
            if(s.contains(arr[i])) s = s.replace(arr[i],String.valueOf(i));
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
