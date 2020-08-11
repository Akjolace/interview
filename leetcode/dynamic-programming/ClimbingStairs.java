/*
70. Climbing Stairs
        You are climbing a stair case. It takes n steps to reach to the top.

        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?*/
public class ClimbingStairs{
    public int climbStairs(int n){
        if(n <= 0) return 0;
        if(n == 1 || n == 2) return n;

        int a = 1;
        int b = 2;
        for(int i = 3; i <= n; i++){
            int temp = a;
            a = b;
            b = a + temp;
        }
        return b;
    }
}