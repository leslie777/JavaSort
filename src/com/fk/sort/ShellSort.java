package com.fk.sort;

/**
 * 希尔排序/缩小增量排序
 * 时间复杂度 O()
 *
 * @author fk
 * @date 2017/12/18
 */
public class ShellSort extends Sort{
    public static void main(String[] args) {
        //int[] a = {3,4,5,1,2,9,7,8,0,6};
        int[] a = new int[100000];
        for(int i = 0; i < a.length ; i++){
            a[i] = (int)(Math.random()*100);
        }
        //print(a,"排序前");
        long startTime = System.currentTimeMillis();
        ShellSort(a);
        long endTime = System.currentTimeMillis();
        //print(a,"排序完成");
        System.out.println("耗时"+(endTime-startTime)+"ms");
    }

    public static void ShellSort(int[] a) {
        int dk = a.length/2; //初始增量
        while(dk>0) {
            ShellInsertSort(a, dk);//以dk为增量进行插入排序
            //print(a,"增量"+dk);
            dk/=2;
        }
    }

    //以dk为增量进行插入排序
    private static void ShellInsertSort(int[] a, int dk) {
        for(int i=dk; i<a.length; i++) { //从dk位置向后遍历插入
            ShellInsert(a, dk, i);//一次插入
        }
    }
    private static void ShellInsert(int[] a, int dk, int i) {
        int temp = a[i];//哨兵，缓存需要插入的值
        int j = i-dk;//插入值上一个位置，起始
        for( ; j>=dk-1&&a[j]>temp; j-=dk) {//j一直到dk-1位置。将比哨兵大的向前移动
            a[j+dk] = a[j];
        }
        a[j+dk] = temp;//找到位置，插入
    }

}
