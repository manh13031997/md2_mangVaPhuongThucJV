public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        int[] array={3,4,2,5,6,4};
        int min=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("giá trị nhỏ nhất là: "+min);
}
}
