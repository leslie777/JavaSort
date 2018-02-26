package com.fk.algorithm;

/**
 * 阶乘
 * 用java编写一个程序,计算1!+2!+3!+4!+5!
 * @author fk
 * @date 17:48 2018/2/24
 */
public class Factorial {
    public static int foo(int n){
        int sum=0;
        int m;
        for(int i = 1;i <= n;i++){
            m=1;
            for(int j = 1; j<=i;j++){
                m*=j;
            }
            sum+=m;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(foo(5));
    }
}
