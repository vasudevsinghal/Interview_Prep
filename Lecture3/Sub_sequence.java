package Lecture3;

public class Sub_sequence {
    public static void main(String[] args) {
        String s = "abc";

        for (int i = 0; i < Math.pow(2, s.length()); i++) {
            String subSeq = "";

            int n = i;
            int count = 0;

            while(n != 0){
                if((n&1) == 1){
                    subSeq += s.charAt(count);
                }

                n = n>>1;
                count++;
            }
            System.out.println(subSeq);
        }
    }
}
