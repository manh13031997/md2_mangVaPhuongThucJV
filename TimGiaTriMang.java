import java.util.Scanner;

public class TimGiaTriMang {
    public static void main(String[] args) {
        String[] students={"manhdz","đatngao","hahap"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập tên SV: ");
        String name=scanner.nextLine();
        boolean isExist=false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println("vị trí sv "+name +"là "+i);
                isExist=true;
                break;
            }
        }
        if (isExist){
            System.out.println("khong tìm thấy vị trí"+name+"trong danh sách");
        }
    }
}
