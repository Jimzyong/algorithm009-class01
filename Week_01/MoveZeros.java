package leetcode;

import java.util.Arrays;

public class MoveZeros {
    //思路 指针法 一次遍历
    //循环遍历数组，可设ab两个指针，a指针查找当前不为0的，b指针为当前为0的
    //当a指针走到不为0时，与第一个为0的指针j做对换，对换后，并将指针位置向后
    //移一位，依次循环，即可得到结果
    public static  void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j++]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int []nums={0,1,0,3,16};
        moveZeroes2(nums);
        System.out.println(Arrays.toString(nums));
    }

    //第二种思路
    //也是移动ab两个指针，但ab两个指针移动后，最后要将末尾只为0
    public static  void moveZeroes2(int[] nums) {
        int j=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for (int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }

}
