package Lecture4;

public class SubSeq {
    public static void main(String[] args) {
        String str = "abc";
        subseq(str, "");
    }

    public static void subseq(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        subseq(str.substring(1), ans+ch);
        subseq(str.substring(1), ans);
    }
}
