package Lecture3;

public class Unique {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 1, 2, 4};

        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor^arr[i];
        }

        System.out.println(xor);
    }
}
