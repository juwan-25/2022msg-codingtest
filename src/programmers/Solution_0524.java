package programmers;

import java.util.Locale;
import java.util.Scanner;

public class Solution_0524 {
    public static String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] str = s.split("");
        for(int i=0; i< str.length; i++){
            if(str[i].equals(" ")) cnt = 0;
            else if(cnt%2==0) {
                str[i]=str[i].toUpperCase();
                cnt++;
            }
            else if(cnt%2==1){
                str[i] = str[i].toLowerCase();
                cnt++;
            }
        }
        for(int i=0; i< str.length; i++)
            answer+=str[i];
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(solution(s));
    }
}
