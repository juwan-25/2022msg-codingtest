package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution_0517
{
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> arrlist = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) arrlist.add(arr[i]);
        }
        if(arrlist.isEmpty()) arrlist.add(-1);

        answer = new int[arrlist.size()];

        for(int i=0; i< arrlist.size(); i++)
            answer[i] = arrlist.get(i);

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[num];
        int divisor = sc.nextInt();
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.println(Arrays.toString(solution(arr,divisor)));
    }
}
