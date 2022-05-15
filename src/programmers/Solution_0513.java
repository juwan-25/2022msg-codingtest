package programmers;

import java.util.Scanner;

public class Solution_0513 {
    public static long solution(int price, int money, int count) {
        long sum=0;
        for(int i=1; i<=count; i++)
            sum +=i*price;
        if(sum>money) return sum - money;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int money = sc.nextInt();
        int count = sc.nextInt();

        System.out.println(solution(price, money, count));
    }
}
