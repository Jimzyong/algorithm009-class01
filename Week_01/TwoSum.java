package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={3,3,11,15};
        nums=twoSumWithJB(nums,6);
        for (int i:nums){
            System.out.println(i);
        }
    }
    public static  int[] twoSum(int[] nums, int target) {
        //hash 将数组转换成hash 以下标为键值

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] a = new int[2];

        int len = nums.length;
        //将nums转换成map
        for (int i = 0; i < len ; i++) {
            map.put(nums[i], i);
        }

        for (int j = 0; j < len ; j++) {
            int num = target - nums[j];
            if (map.containsKey(num) && map.get(num) != j) {
                a[0] = j;
                a[1] = map.get(num);
                return a;
            }
        }
        return null;
    }

    public static int[] twoSumWithJB(int[] nums,int target){


    int len=nums.length;
    int[] nums3=nums.clone();
    //对数组排序
        Arrays.sort(nums);
        System.out.println(Arrays.equals(nums,nums3));
    int i=0;
    int j=len-1;
    //使用夹逼原则
    int[] a=new int[2];
        for (int k=0;k<len;k++){

        int sum = nums[i]+nums[j];
        if(sum>target){
            j--;
        }
        if(sum<target){
            i++;
        }
        if(sum==target&&i!=j){
            for(int m=0;m<len;m++){
                if(nums[i]==nums3[m]){
                    a[0]=m;
                }
              for(int h=m+1;m<len;m++){
                  if(nums[j]==nums3[h]){
                      a[1]=h;
                  }
              }

            }
        }
    }
        return  null;
}

public  static int[] twoSumThree(int[] nums,int target){
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);
    }
    throw new IllegalArgumentException("No two sum solution");
}






}
