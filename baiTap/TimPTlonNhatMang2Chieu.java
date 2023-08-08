package baiTap;

public class TimPTlonNhatMang2Chieu {
    public static void main(String[] args) {
        int[][] array = {{3, 4, 6, 1,2,5,5,6,4},
                {2, 4, 8, 1}};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("giá trị lớn nhất " + max);

    }
}
