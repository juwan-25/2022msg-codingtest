package programmers;

import java.util.Scanner;

public class Solution_0520 {
    public static String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length; i++) {
            if (arr[i] == ' ') {
                answer += arr[i];
                continue;
            }
            if(arr[i]>=97&&arr[i]<=122){
                if(arr[i]+n>122) arr[i]+=n-26;
                else arr[i]+=n;
            } else if(arr[i]>=65&&arr[i]<=90) {
                if(arr[i]+n>90) arr[i]+=n-26;
                else arr[i]+=n;
            }
            answer+=arr[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = sc.nextInt();
        System.out.println(solution(str,num));
    }
}
