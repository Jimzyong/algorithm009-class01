package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
//
// 有效字符串需满足：
//
//
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
//
//
// 注意空字符串可被认为是有效字符串。
//
// 示例 1:
//
// 输入: "()"
//输出: true
//
//
// 示例 2:
//
// 输入: "()[]{}"
//输出: true
//
//
// 示例 3:
//
// 输入: "(]"
//输出: false
//
//
// 示例 4:
//
// 输入: "([)]"
//输出: false
//
//
// 示例 5:
//
// 输入: "{[]}"
//输出: true
// Related Topics 栈 字符串
public class Bracket {
    Map<Character, Character> map;
    //利用栈的特性


 /*   public Bracket() {
        this.map  =new  HashMap<Character, Character>();
        this.map.put(')', '(');
        this.map.put('}', '{');
        this.map.put(']', '[');
    }*/

    public static void main(String[] args) {
        String s="()[]{}";
        Bracket n=new Bracket();
        System.out.println(n.isValid3(s));
    }

    public boolean isValid(String s) {

        Stack<Character> stack=new Stack<Character>();
        char[] ss=s.toCharArray();
        for (int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(this.map.containsKey(c)){
                char topElement=stack.empty()?'#':stack.pop();
                if(topElement!=this.map.get(c)){
                    return  false;
                }
            }else {
                stack.push(c);
            }
        }
        return  stack.isEmpty();
    }

    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public Bracket() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

/*    public boolean isValid2(String s) {

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (this.mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }*/
    public static final Map<Character,Character> smap=
        new HashMap<Character, Character>(){
            {put('{','}');put('(',')');put('[',']');}
        };
    public  boolean isValid3(String s){
        /*if(s.isEmpty())
            return true;
        Stack<Character> stack=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if(c=='{')
                stack.push('}');
            else if(c=='[')
                stack.push(']');
            else if(stack.empty()||c!=stack.pop())
                return false;
        }
        if(stack.empty())
            return true;
        return false;*/
        if(s.isEmpty()){
            return  true;
        }
        Stack<Character> stack=new Stack<Character>();
        for (char c:s.toCharArray()){

            if(c=='{') {
                stack.push('}');
            }else if(c=='('){
                stack.push(')');
            }else  if(c=='['){
                stack.push(']');
            }else if(stack.empty()||c!=stack.pop()){
                //System.out.println(stack.pop());

                return  false;
            }
        }
        //stack.pop();
        return  false;
    }

}
