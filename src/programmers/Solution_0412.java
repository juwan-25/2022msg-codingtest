package programmers;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution_0412 {
    public static int[] solution(long n) {
        int[] answer = {};
        int[] origin = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        answer = new int[origin.length];
        int leng = origin.length-1;
        for(int i=0; i<=leng; i++){
            answer[i] = origin[leng-i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        for(int i=0; i<solution(num).length; i++){
            System.out.print(solution(num)[i]+" ");
        }

    }
}
