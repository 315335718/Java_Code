package chapter01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
class Sort{
    String type;
    int[] a;
    void bubble_sort(int[] a){
        this.a = a.clone();
        System.out.println("#########   冒泡排序   #########");
        System.out.println(Arrays.toString(this.a));
        for (int i = this.a.length - 1; i > 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if(this.a[j]>this.a[j+1]){
                    int temp = this.a[j];
                    this.a[j] = this.a[j+1];
                    this.a[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
            System.out.println(Arrays.toString(this.a));
        }
    }
    void select_sort(int[] a){
        this.a = a.clone();
        System.out.println("\n#########   选择排序   #########");
        System.out.println(Arrays.toString(this.a));
        for (int i = 0; i < this.a.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < this.a.length; j++) {
                if(this.a[min_index]>this.a[j]){
                    min_index = j;
                }
            }
            int temp = this.a[i];
            this.a[i] = this.a[min_index];
            this.a[min_index] = temp;
            System.out.println(Arrays.toString(this.a));
        }
    }


}



public class Demo1_sort {


    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // int a[] = {10,9,8,7,6,5,4,3,2,1};
        int[] a = {7,6,1,3,4,5,8,10,9,2};

        Sort s = new Sort();
        s.select_sort(a);
        s.bubble_sort(a);

    }


}
