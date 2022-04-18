package programmers;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_0418 {
    public static int[] solution(int[] arr) {
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length-1];
        int min = arr[0];
        for(int i=1; i<arr.length; i++)
            if(min>arr[i]) min = arr[i];
        int j=0;
        for(int i=0; i< arr.length; i++){
            if(arr[i]==min) continue;
            answer[j] = arr[i];
            j++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0; i< arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(solution(arr)));
    }
}
