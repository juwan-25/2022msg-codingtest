package programmers;

import java.util.Scanner;

public class Solution_0411 {
    public static int solution(int[] nums) {
        int answer = 0;
        int sum;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for (int k=j+1; k<nums.length; k++){
                    sum=nums[i]+nums[j]+nums[k];
                    for(int x=2; x<=sum; x++) {
                        if (sum % x == 0 && x != sum) break;
                        else if(x==sum) answer++;
                    }
                }
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("개수 입력 : ");
        int input = sc.nextInt();
        int[] nums = new int[input];
        for(int i=0; i<nums.length; i++)
            nums[i] = sc.nextInt();
        System.out.println("결과 : "+solution(nums));
    }

}
