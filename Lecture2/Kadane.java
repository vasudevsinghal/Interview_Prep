package Lecture2;

public class Kadane {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 1, -2, 21, 1};

        int curSum = 0;
        int maxSum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if(curSum < arr[i]){
                curSum = arr[i];
            }

            if(curSum > maxSum){
                maxSum = curSum;
            }
        }

        System.out.println(maxSum);
    }
}
