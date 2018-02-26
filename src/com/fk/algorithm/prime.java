package com.fk.algorithm;

/**
 * 判断素数
 * @author fk
 * @date 18:02 2018/2/24
 */
public class Prime {
    public static boolean tryPrime(int num){
        boolean flag = true;
        for(int i = 2 ; i <num;i++){
            if(num%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(tryPrime(6));
    }
}
