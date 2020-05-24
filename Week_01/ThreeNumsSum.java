package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeNumsSum {
    public List<List<Integer>> threeSum(int[] nums) {
        //思路
        //数组套路 双指针 暴力求解一般复杂度很高，此处用暴力求解度话
        //三层循环 时间复杂度为O(n^3)

        //所以采用双指针法
        //首先对数组排序
        Arrays.sort(nums);
        if(nums.length<3){
            throw  new IllegalArgumentException();
        }
        //新建集合
        List<List<Integer>> res = new ArrayList<>();
        //遍历数组 因为i,j 已经占了两位 所以在原来的len基础上 -2
        for(int k = 0; k < nums.length - 2; k++){
            //k为数组第一个元素，当nums[k]>0时，说明数组都为正，不可能为0，排除
            if(nums[k] > 0) break;
            //当数组中其他元素有与k重复时候 直接略过
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            //定义两个指针  i指针在k指针前一个位置，j指针在最末尾
            int i = k + 1, j = nums.length - 1;
            //移动指针的时候当i的位置与j的位置重合或者超过j是，移动结束
            while(i < j){
                //计算 k i j的和
                int sum = nums[k] + nums[i] + nums[j];
                if(sum < 0){
                    //当
                    while(i < j && nums[i] == nums[++i]);
                } else if (sum > 0) {
                    while(i < j && nums[j] == nums[--j]);
                } else {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }




}