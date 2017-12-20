/**
 * Created by fk on 2017/12/18.
 */
public class Sort {
    public static void print(int[] a, String msg) {
        System.out.print(msg+":");
        for(int b:a) {
            System.out.printf(b+",");
        }
        System.out.println();
    }

    public static void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
