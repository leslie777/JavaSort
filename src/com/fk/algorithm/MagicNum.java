package com.fk.algorithm;

import java.util.HashSet;

/**
 * 魔术数是指一个数既是一个自然数的平方数，也是一个自然数的立方，
 * 比如1=1*1=1*1*1， 64=8*8=4*4*4;请问【1，10^12】（1到1万亿之间，
 * 包含1和1万亿）之间所有的魔术数有__个。（程序必须在一秒能出结果)。
 * @author fk
 * @date 9:22 2018/2/26
 */
public class MagicNum {
    public static HashSet<Integer> countMagic(double max){
        //double maxFind = Math.pow(max,1/3)+Math.pow(max,1/2);
        double maxFind = 1000000+10000;
        int two=1;
        int three=1;
        HashSet<Integer> hs= new HashSet<>();
        int twoTemp=1;
        int threeTemp=1;

        while((two+three)<=maxFind){

            twoTemp = two*two;
            threeTemp= three*three*three;
            if(twoTemp==threeTemp){
                hs.add(twoTemp);
                two++;
                three++;
            }else if(twoTemp<threeTemp){
                two++;
            }else if(threeTemp<twoTemp){
                three++;
            }
        }
        return hs;
    }
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        HashSet<Integer> hs = countMagic(10000*10000*10000);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
        System.out.println(hs.size());
        System.out.println(hs.toString());
    }
}
