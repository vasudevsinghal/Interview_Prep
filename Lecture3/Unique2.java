package Lecture3;

public class Unique2 {
    public static void main(String[] args) {
        
        int[] arr = new int[]{2, 4, 1, 2, 4, 5};

        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor^arr[i];
        }

        // xor = 1 ^ 5
        int n = xor;
        int pos = 0;
        while((n&1) != 1){
            pos++;
            n = n>>1;
        }

        int mask = 1<<pos;

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if((arr[i]&mask) > 0){
                ans = ans^arr[i];
            }
        }

        System.out.println(ans+" "+(ans^xor));


    }
}
