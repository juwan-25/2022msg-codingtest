package programmers;

import java.util.Scanner;

public class Solution_0405 {
    static int solution(int n) {
        int answer = 0;
        int i=2;
        while(true){
            if((n-1)%i==0){
                answer = i;
                break;
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("수 입력 : ");
        int num = sc.nextInt();
        System.out.println("결과 : "+solution(num));
    }
}
