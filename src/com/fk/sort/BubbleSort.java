package com.fk.sort;

/**
 * 冒泡排序
 * 时间复杂度 O(n^2)
 *
 * @author fk
 * @date 2017/12/19
 */
public class BubbleSort extends Sort{
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2,9,7,8,0,6};
        /*int[] a = new int[100000];
        for(int i = 0; i < a.length ; i++){
            a[i] = (int)(Math.random()*100);
        }*/
        print(a,"排序前");
        long startTime = System.currentTimeMillis();
        BubbleSort(a);
        long endTime = System.currentTimeMillis();
        print(a,"排序完成");
        System.out.println("耗时"+(endTime-startTime)+"ms");
    }

    public static void BubbleSort(int[] a) {
        for(int i=0; i<a.length; i++){
            Bubble(a);
            print(a,"第"+i+"次冒泡");
        }
    }

    /**
     * 单次向后冒泡
     * @param a
     */
    private static void Bubble(int[] a) {
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                swap(a,i,i+1);
            }
        }
    }
}

