import java.util.Arrays;


class Solution {
 
 public static int[] solution(int[] prices) {
     int[] answer = new int[prices.length];

     for(int i = 0; i < prices.length; i++)
     {
         for(int j=i+1; j < prices.length; j++)
         {
             if(prices[i] > prices[j])
             {
                 answer[i] = j-i;
                 break;
             }
             answer[i] = j-i;
         }
     }
     return answer;
 }
}
