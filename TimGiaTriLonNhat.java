import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhập size");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("kích thước không được quá 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("nhập vào phần tử" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }

        }
        System.out.println("\n giá trị lớn nhất là: "+max);
    }
}
