package Lecture2;

public class Pallindrome {
    static String longestPalin(String S){
        // code here
        
        int size = 0;
        String str = "";
        
        for(int i =0; i<S.length(); i++){
            // odd
            int count = 1;
            String odd = ""+S.charAt(i);
            
            int left = i-1;
            int right = i+1;
            
            while(left >=0 && right < S.length()){
                if(S.charAt(left) == S.charAt(right)){
                    count += 2;
                    odd = S.charAt(left) + odd + S.charAt(right);
                }
                else{
                    break;
                }
                left--;
                right++;
            }
            
            if(count > size){
                str = odd;
                size = count;
            }
            
            
            // even
            count = 0;
            String even = "";
            
            left = i;
            right = i+1;
            
            while(left >=0 && right < S.length()){
                if(S.charAt(left) == S.charAt(right)){
                    count += 2;
                    even = S.charAt(left) + even + S.charAt(right);
                }
                else{
                    break;
                }
                left--;
                right++;
            }
            
            if(count > size){
                str = even;
                size = count;
            }
            
            
        }
        
        return str;
        
    }
}
