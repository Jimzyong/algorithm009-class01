package leetcode;

/**
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 */
public class MoreWater11 {
    //已经用暴力法求解了，这边再写一遍 双指针法
    public int maxArea(int[] height) {
        int len=height.length;
        int a=0;
        int maxArea=0;
        int b=len-1;
        for (int i=0;i<len;i++){
            int minheight=Math.min(height[a],height[b]);
            maxArea=Math.max(minheight*(b-a),maxArea);
            if(height[a]<height[b]){
                a++;
            }else {
                b--;
            }
        }
        return maxArea;
    }

    public int maxArea2(int[] height) {
        int len=height.length;
        int maxArea=0;
        for (int i=0;i<len;i++) {
            for (int j=i+1;j<len;j++){
                //容器最大取决于 计算出最小但长度
                int minheight=Math.min(height[i],height[j]);
                maxArea=Math.max(minheight*(j-i),maxArea);
            }
        }
        return  maxArea;
    }


}
