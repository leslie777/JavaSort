/**
 * 快速排序
 * 时间复杂度 O(NlogN)
 * 若基本有序则退化为冒泡排序
 *
 * @author fk
 * @date 2017/12/19
 */
public class QueckSort extends Sort {
    public static void main(String[] args) {
        //int[] a = {3,4,5,1,2,9,7,8,0,6};
        int[] a = new int[100000];
        for(int i = 0; i < a.length ; i++){
            a[i] = (int)(Math.random()*100);
        }
        //print(a,"排序前");
        long startTime = System.currentTimeMillis();
        QueckSort(a, 0, a.length-1);
        long endTime = System.currentTimeMillis();
        //print(a,"排序完成");
        System.out.println("耗时"+(endTime-startTime)+"ms");
    }

    public static void QueckSort(int[] a,int i, int j) {
        if(i<j){//递归出口，无法二分
            int mid = getMid(a, i, j);
           // print(a,"第"+i+"次快拍");
            QueckSort(a, i, mid);//递归排序前半部分
            QueckSort(a, mid+1, j);//递归排序后半部分
        }
    }

    private static int getMid(int[]a, int i, int j) {
        int p = a[i];//记录基准数值
        int left = i;//记录基准数位置
        while(j>i){//直到i,j左右哨兵相遇
            while(a[j]>=p&&j>i){//自后向前，找到第一个比基准小的停下来
                j--;
            }
            while(a[i]<=p&&j>i){//自前向后，找到第一个比基准大的停下来
                i++;
            }
            if(j>i){
                swap(a, i, j);//一次查找结束，交换大小两个数
            }
        }
        swap(a, left, i);//一次遍历结束，将中间位置与基准数互换
        return i;//返回中间位置
    }
}
