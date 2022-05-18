package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution_0518 {
    public static int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> arrList = new ArrayList<Integer>();
        arrList.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]==arr[i]) continue;
            else arrList.add(arr[i]);
        }
        answer = new int[arrList.size()];
        for(int i=0; i< arrList.size(); i++)
            answer[i] = arrList.get(i);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0; i< arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(solution(arr)));
    }
}
