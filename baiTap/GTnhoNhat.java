package baiTap;

import java.util.Scanner;

public class GTnhoNhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập size ");
        size = scanner.nextInt();
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("nhập phần tử "+i+1+": ");
            array[i]=scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        int  soNhoNhat = array[0];
        for (int j = 0; j < array.length; j++) {

            if (soNhoNhat > array[j]){
                soNhoNhat = array[j];
            }

        }
        System.out.println("Sô nhỏ nhất "+soNhoNhat);

    }
}
