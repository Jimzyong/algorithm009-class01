package leetcode;


public class ClimbStairs {
    //爬楼梯可以总结为斐波那契数列
    //用斐波那契数列公式

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
    public static int climbStairs(int n){
       return  climb_stairs(n,0);
    }

    private  static int climb_stairs(int n, int i) {
        if (n==1) {
          return   i= 1;
        }
        if (n==2) {
            return  i=2;
        }
        return  climb_stairs(n-i-1,i)+climb_stairs(n-i-2,i);
    }
    //使用动态规划
    public static int climbStairs2(int n){
        int[] dp=new int[n+1] ;
        dp[0]=0;
        dp[1]=1;
        for (int i=2;i<=n;i++){
            dp[i]=dp[i]+dp[i-1];
        }
        return dp[n];

    }

}
