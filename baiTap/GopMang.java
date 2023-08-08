package baiTap;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] arr={3,5,1,6};
        int[] array={2,4,5,6};
        int[] array1=new int[arr.length+array.length];
        for (int i = 0; i < array1.length; i++) {
            if (i<arr.length){
                array1[i]=arr[i];
            }else {
                array1[i]=array[i-arr.length];
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}
