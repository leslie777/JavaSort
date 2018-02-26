package com.fk.sort;

/**
 * 选择排序
 * 时间复杂度 O(n^2)
 *
 * @author fk
 * @date 2017/12/19
 */
public class SelectSort extends Sort{
    public static void main(String[] args) {
        int[] a = {3,4,5,1,2,9,7,8,0,6};
        /*int[] a = new int[100000];
        for(int i = 0; i < a.length ; i++){
            a[i] = (int)(Math.random()*100);
        }*/
        //print(a,"排序前");
        long startTime = System.currentTimeMillis();
        DoubleSelectSort(a);
        long endTime = System.currentTimeMillis();
        //print(a,"排序完成");
        System.out.println("耗时"+(endTime-startTime)+"ms");
    }
    //简单选择排序
    public static void SimpleSelectSort(int[] a) {
        for(int i = 0; i < a.length; i++) {
            //向后遍历数组进行单次选择
            SimpleSelect(a, i);
            print(a,"第"+i+"次选择");
        }
    }
    //简单选择
    private static void SimpleSelect(int[] a, int i) {
        int k = i;//记录最小值位置
        int j = i+1;
        for(; j < a.length; j++) {//向后遍历
            if(a[k]>a[j]){
                k=j;//若找到一个更小值，记录位置
            }
        }
        swap(a,k,i);//将找到的最小值交还给i位置
    }

    /**
     * 改进双向选择，记录最大和最小位置
     */
    private static void DoubleSelectSort(int[] a) {
        for(int i = 0; i < a.length/2+1; i++) {
            //向后遍历数组进行单次选择
            DoubleSelect(a, i);
            print(a,"第"+i+"次选择");
        }
    }
    //简单选择
    private static void DoubleSelect(int[] a, int i) {
        //记录最小值位置
        int min = i;
        int max = i;
        int j = i+1;
        //向后遍历中间一段
        for(; j < a.length-i; j++) {
            if(a[min]>a[j]){
                //若找到一个更小值，记录位置
                min=j;
                continue;
            }
            if(a[max]<a[j]){
                //若找到一个更大值，记录位置
                max=j;
            }
        }
        //将找到的最小值交还给i位置
        swap(a,min,i);
        //将找到的最小值交还给a,length-i位置
        swap(a,max,a.length-1-i);
    }
}
