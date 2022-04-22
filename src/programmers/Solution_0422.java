package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_0422 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++){
            if (phone_book[i + 1].startsWith(phone_book[i])){
                return false;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] phone = new String[num];
        for(int i=0; i<phone.length; i++)
            phone[i] = sc.next();
        System.out.println(solution(phone));
    }
}
