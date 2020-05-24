package leetcode;

import java.util.HashMap;

public class GuessNum {
   /* public String getHint(String secret, String guess) {
        int A = 0;
        //遍历循环，如果字符相等 则A++；
       for(int i = 0; i<guess.length();i++)
       {
        if (secret.charAt(i) == guess.charAt(i)) {
            A++;
        }
    }
        *//**
         * 记录两个数组
         *//*
    HashMap<Character, Integer> mapS = new HashMap<>();
    HashMap<Character, Integer> mapG = new HashMap<>();
    for(int i = 0; i<secret.length();i++)

    {
        mapS.put(secret.charAt(i), mapS.getOrDefault(secret.charAt(i), 0) + 1);
        mapG.put(guess.charAt(i), mapG.getOrDefault(guess.charAt(i), 0) + 1);
    }

    int B = 0;
    for(
    Character key :mapG.keySet())

    {
        int n1 = mapG.getOrDefault(key, 0);
        int n2 = mapS.getOrDefault(key, 0);
        B = B + Math.min(n1, n2);
    }
    return A +"A"+(B -A)+"B";

}*/
    public String getHint(String secret, String guess){
    //定义a b两个数字
    int A = 0, B = 0;
    //定义两个桶
    int[] extra1 = new int[10];
    int[] extra2 = new int[10];

        for(int i = 0; i < secret.length(); i++)
    {
        int a = secret.charAt(i) - '0';//注意数字和ASCII码之间的转换
        int b = guess.charAt(i) - '0';
        if(a == b)  {A++;}//当a=b时 A++
        else {
            extra1[a]++;
            extra2[b]++;
        }
    }
        for(int i = 0; i < 10; i++) {
            B += Math.min(extra1[i], extra2[i]);
        }
        return A + "A" + B + "B";
}


}
