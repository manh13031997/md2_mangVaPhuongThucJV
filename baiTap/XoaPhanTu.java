package baiTap;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int[] array = {2, 4, 7, 3, 6, 9, 8, 0, 8};
        int x = 7;
        int index = searchelement(array, x);
        if (index == array.length - 1) {
            System.out.println("không tìm thấy");
        } else {
            System.out.println("tìm thấy vị trí tại " + index);
        }
        del(array, index);
        System.out.println(Arrays.toString(array));
    }

    //    quản lý bộ nhớ có thể truy cập trực tiếp
    static int searchelement(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    static void del(int[] array, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
    }

}
