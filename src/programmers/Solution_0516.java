package programmers;

import java.util.Scanner;

public class Solution_0516 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<absolutes.length; i++){
            if(signs[i]) answer+=absolutes[i];
            else answer+=(-1*absolutes[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();
        int[] absolute = new int[len];
        boolean[] signs = new boolean[len];

        for(int i=0; i< absolute.length; i++)
            absolute[i] = sc.nextInt();

        for(int i=0; i< signs.length; i++)
            signs[i] = sc.nextBoolean();

        System.out.println(solution(absolute,signs));
    }
}
