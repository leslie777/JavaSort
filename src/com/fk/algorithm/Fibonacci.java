package com.fk.algorithm;

import java.util.HashMap;

/**
 * 一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 求第30位数是多少， 用递归算法(动态规划)实现。
 * @author fk
 * @date 16:08 2018/2/24
 */
public class Fibonacci {
    /**
     * 使用递归，重复计算效率低，不推荐,时间复杂度类似遍历二叉树O(2^N)
     * @param n
     * @return
     */
    public static int FibonacciSum(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return FibonacciSum(n-1)+FibonacciSum(n-2);
        }
    }

    /**
     * 备忘录算法，优化递归，记录计算结果，省去重复计算,时间复杂度O(N),空间复杂度O(N)，，要保存所有位置
     * @param n
     * @return
     */
    public static int FibonacciSum2(int n, HashMap<Integer,Integer> map){
        if(n==1||n==2){
            return 1;
        }else{
            if(map.containsKey(n)){
                return map.get(n);
            }else{
                int value = FibonacciSum2(n-1,map)+FibonacciSum2(n-2,map);
                map.put(n,value);
                return value;
            }

        }
    }

    /**
     * 动态规划，迭代思想，一步一步向上，,时间复杂度O(N)，不保存所有位置，空间复杂度O(N)
     * @param n
     * @return
     */
    public static int FibonacciSum3(int n){
        if(n==1||n==2){
            return 1;
        }else{
            int a = 1;
            int b = 1;
            int temp = 0;
            for(int i=3;i<=n;i++){
                temp = a+b;
                a = b;
                b = temp;
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(FibonacciSum(44)+","+(System.currentTimeMillis()-time));
        System.out.println(FibonacciSum2(44,new HashMap<>(16))+","+(System.currentTimeMillis()-time));
        System.out.println(FibonacciSum3(44)+","+(System.currentTimeMillis()-time));
    }
}

