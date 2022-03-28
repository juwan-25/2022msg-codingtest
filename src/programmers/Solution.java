package programmers;

import java.util.Scanner;

public class Solution {
    static String solution(int num) {
        if(num%2==0) return "Even";
        else return "Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));

    }
}
