package Lecture4;

// https://leetcode.com/problems/powx-n/
public class Power {
    public double myPow(double x, int n) {
        return powRes(x, n);
    }
    
    public double powRes(double x, long n) {
        if(n==0){
            return 1;
        }
        
        if(n<0){
            n = -n;
            x = 1/x;
        }
        
        double half = powRes(x, n/2);
        
        if(n%2==0){
            return half*half;
        }
        else{
            return x*half*half;
        }
    }
}
