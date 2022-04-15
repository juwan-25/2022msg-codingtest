package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution_0415 {
    public static int[] solution(int[] answers) {
        int[] answer = {};
        List<Integer> answer_list = new ArrayList<Integer>();
        int[] cnt = new int[3];

        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};

        int[] one_a = new int[answers.length];
        int[] two_a = new int[answers.length];
        int[] three_a = new int[answers.length];
        for(int i=0; i < answers.length; i++){
            one_a[i] = one[i%one.length];
            two_a[i] = two[i% two.length];
            three_a[i] = three[i% three.length];
        }

        for(int i=0; i< answers.length; i++){
            if(answers[i]==one_a[i]) cnt[0]++;
            if(answers[i]==two_a[i]) cnt[1]++;
            if(answers[i]==three_a[i]) cnt[2]++;
        }

        if(cnt[0]>cnt[1]&&cnt[0]>cnt[2]) answer_list.add(1);
        else if(cnt[1] > cnt[0] && cnt[1] > cnt[2]) answer_list.add(2);
        else if(cnt[2] > cnt[0] && cnt[2] > cnt[1]) answer_list.add(3);
        else if(cnt[0] == cnt[1]){
            if(cnt[0]==cnt[2]){
                for(int i=0; i<3; i++)
                    answer_list.add(i+1);
            }else{
                for(int i=0; i<2; i++)
                    answer_list.add(i+1);
            }
        }else if(cnt[1]==cnt[2]){
            for(int i=0; i<2; i++)
                answer_list.add(i+2);
        }else{
            answer_list.add(1);
            answer_list.add(3);
        }
        answer = answer_list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String out_str = "";
        int q_num = sc.nextInt();
        int[] answers = new int[q_num];
        for(int i=0; i< answers.length; i++)
            answers[i] = sc.nextInt();
        System.out.println(Arrays.toString(solution(answers)));
    }

}
