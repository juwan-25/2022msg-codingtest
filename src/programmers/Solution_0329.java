package programmers;

import java.util.Scanner;

public class Solution_0329 {
    static long[] solution(int x, int n) {
        long[] answer = new long[n];
        long num = x;
        for(int i=0; i<answer.length; i++){
            answer[i]=num;
            num+=x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        long[] arr = solution(x,n);
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");

    }
}
