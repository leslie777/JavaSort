package com.fk.sort;

/**
 * 插入排序
 * 时间复杂度 O(n^2)
 *
 * @author fk
 * @date 2017/12/18
 */
public class InsertSort extends Sort {
    public static void main(String[] args) {
        //int[] a = {3,4,5,1,2,9,7,8,0,6};
        int[] a = new int[100000];
        for(int i = 0; i < a.length ; i++){
            a[i] = (int)(Math.random()*100);
        }
        //print(a,"排序前");
        long startTime = System.currentTimeMillis();
        insertSort(a);
        long endTime = System.currentTimeMillis();
       // print(a,"排序完成");
        System.out.println("耗时"+(endTime-startTime)+"ms");
    }

    //插入排序算法
    public static void insertSort(int[] a) {
        for(int i=1;i<a.length;i++){//认为第一个数字是有序的，从第二个开始
            insert(a,i);
            //print(a,"第"+i+"次插入");
        }
    }

    //一次插入,将第i个数字插入到前面有序的序列中
     static void insert(int[] a,int i) {
        int temp = a[i];//取出要插入的数字缓存,哨兵
        int j=i-1;
        for(;j>=0&&a[j]>temp;j--) {//遍历之前有序数组，将比自己大的数据前移
            a[j+1]=a[j];
        }
        a[j+1]=temp;//走完比该数大的找到插入位置，将temp插入
    }
}
