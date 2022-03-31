package programmers;

import java.util.Scanner;

public class Solution_0331 {
    public static String solution(String phone_number) {
        String answer ="";
        String[] arr= phone_number.split("");
        for(int i=0; i<phone_number.length()-4; i++)
            arr[i] = "*";
        answer = String.join("",arr);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phone_num = sc.next();
        System.out.println(solution(phone_num));
    }
}
