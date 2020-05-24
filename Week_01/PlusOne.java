package leetcode;

//给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
//
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
//
// 你可以假设除了整数 0 之外，这个整数不会以零开头。
//
// 示例 1:
//
// 输入: [1,2,3]
//输出: [1,2,4]
//解释: 输入数组表示数字 123。
//
//
// 示例 2:
//
// 输入: [4,3,2,1]
//输出: [4,3,2,2]
//解释: 输入数组表示数字 4321。
//
// Related Topics 数组


//leetcode submit region begin(Prohibit modification and deletion)
public class PlusOne{
    public static void main(String[] args) {
        int [] num={9,9};
        int[] plus=plusOne(num);
        for (int i:plus){
            System.out.println(i);
        }

    }
    public static int[] plusOne(int[] digits) {

        //这个整数组成的数组应该分为9和9以外，为9时，需递进1

        //int[] digitsplus=digits;
        int len=digits.length;
        for (int i=len-1;i>=0;i--) {

            if(digits[i]==9){
                digits[i]=0;
            }else {
                digits[i]++;
                return digits;
            }

        }
        int[] a=new int [len+1];
        a[0]=1;
        //digitsplus[digitsplus.length-1]=digitsplus[digitsplus.length-1]-1;
        return a;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

