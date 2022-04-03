package programmers;

import java.util.Scanner;

public class Solution_0404 {
    static int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0; i<a.length; i++)
            answer += a[i]*b[i];
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("입력할 수의 개수 입력 : ");
        int length = sc.nextInt();
        int[] arr1 = new int[length];
        int[] arr2 = new int[length];
        System.out.print("입력 1 : ");
        for(int i=0; i<arr1.length; i++)
            arr1[i] = sc.nextInt();
        System.out.print("입력 2 : ");
        for(int i=0; i<arr1.length; i++)
            arr2[i] = sc.nextInt();
        System.out.println("내적 : "+solution(arr1, arr2));
    }
}
