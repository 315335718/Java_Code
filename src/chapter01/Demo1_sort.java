package chapter01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo1_sort {

    public static void bubble_sort(int a[]){
        System.out.println("#########   冒泡排序   #########");
        System.out.println(Arrays.toString(a));
        for (int i = a.length - 1; i > 0; i--) {
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = false;
                }
            }
            if (flag){
                break;
            }
            System.out.println(Arrays.toString(a));
        }
    }


    public static void select_sort(int a[]){
        System.out.println("\n#########   选择排序   #########");
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < a.length; j++) {
                if(a[min_index]>a[j]){
                    min_index = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
            System.out.println(Arrays.toString(a));
        }
    }

    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // int a[] = {10,9,8,7,6,5,4,3,2,1};
        int a[] = {7,6,1,3,4,5,8,10,9,2};

        bubble_sort(a);
        select_sort(a);
    }


}
