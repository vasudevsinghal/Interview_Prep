package Lecture4;

public class StrPer {
    public static void main(String[] args) {
        String str = "abc";
        strPer(str, "");
    }

    public static void strPer(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++) {
            String s = ans.substring(0, i) + ch + ans.substring(i);
            strPer(str.substring(1), s);

        }
    }
}
