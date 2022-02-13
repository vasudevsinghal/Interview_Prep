package Lecture4;

public class Dice {
    public static void main(String[] args) {
        // System.out.println(dice2(4));
        dice3(4, "");
    }

    public static int dice1(int n){

        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        return dice1(n-1) + dice1(n-2) + dice1(n-3) + dice1(n-4) + dice1(n-5) + dice1(n-6);

    }

    public static int dice2(int n){

        if(n == 0){
            return 1;
        }

        int sum = 0;

        for (int i = 1; i <= 6; i++) {
            if(n >= i){
                System.out.print("");
                sum += dice2(n-i);
            }
        }
        return sum;
    }

    public static void dice3(int n, String str){

        if(n == 0){
            System.out.println(str);
        }
        for (int i = 1; i <= 6; i++) {
            if(n >= i){
                String s = str+i;
                dice3(n-i, s);
            }
        }
    }
}
