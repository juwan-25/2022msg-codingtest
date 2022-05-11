package programmers;

import java.util.Scanner;

public class Solution_0512 {
    public static int solution(int num) {
        int answer = 0;
        double n = num;
        while(n!=1){
            answer++;
            if(n%2==0) n/=2;
            else n=(n*3)+1;
            if(answer==500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));
    }
}
