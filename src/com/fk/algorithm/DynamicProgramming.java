package com.fk.algorithm;

/**
 * 很多情况下使用动态规划优于递归，递归很消耗资源，浪费时间
 * @author fk
 * @date 10:51 2018/2/26
 */
public class DynamicProgramming {
    /**
     * 军队里面经常玩一种数字口算游戏，N个人站成一排，编号为1到N，
     * 游戏规则：编号1-3的前3个人数字是确定的，游戏组织者先固定好，
     * 然后从第4个人开始报数，编号为P的人说的数字为编号P-1和编号P-3的人
     * 的数字之和，减去编号为P-2的人的数字的2倍。举个例子：
     * 假如现在第一个人报2，第二个人报3，第三个人报5.那么第四个人报1.
     * 请问第70个人报__，第99个人报__。
     * @param num
     * @return
     */
    public static int countSolder(int num){
        int a=2;//P-3;
        int b=3;//P-2;
        int c=5;//P-1;
        int temp=5;//p
        for(int i = 4; i <= num; i++){
            temp = c+a-2*b;
            a=b;b=c;c=temp;
        }
        System.out.println(temp);
        return temp;
    }
    public static void main(String[] args) {
        countSolder(70);
    }
}
