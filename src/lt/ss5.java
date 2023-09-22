package lt;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ss5 {
    public static void main(String[] args) {
        String fullName = "Hùng Hồ";
        System.out.println(fullName);
//       fullName = "Nam béo";
//       System.out.println(fullName);
        // so sánh 2 chuỗi
        System.out.println(fullName.equalsIgnoreCase("Nam Béo"));
        // tìm kiếm chuỗi con trong chuỗi cha
        System.out.println(fullName.contains("amm"));
        // chuỗi bắt đầu và kết thúc
        System.out.println(fullName.startsWith("Na"));
        System.out.println(fullName.endsWith("o"));
        String str = "";
        // kiểm tra 1 chuỗi có rỗng không
        System.out.println(str.isEmpty());
        // lấy vị trí của kí tự đầu tiên tìm được
        System.out.println(fullName.indexOf("Hồ"));
        // tìm kiếm và thay thế chuỗi
        String content = "String là một kiểu dữ liệu tham chiếu." +
                " Trong ví dụ trên, message là một biến tham\n" +
                "chiếu, tham chiếu tới một đối tượng chuỗi có" +
                " giá trị là Welcome to Java.";
        String rs = content.replace("là","");
        System.out.println(rs);
        System.out.println(content);

        // Nối chuỗi
        String newName = fullName.concat("Hello");
        System.out.println(newName);

        // chuyển 1 chuỗi thành 1 mảng
        String numbers = "1,2,3,4,5,6,7,8,9";
        String array[] = numbers.split(",");
        System.out.println(Arrays.toString(array));

        // in hoa in thường , xóa khoảng trăng 2 đầu
        String demo = "   hello   ";
        System.out.println(demo.trim());

        // bởi vì là 1 mảng kí tư nên có thể duyệt chuỗi
        for (int i = 0; i < demo.length(); i++) {
            System.out.println(demo.charAt(i));
        }
//        for (String ch: demo.split("")) {
//            System.out.println(ch);
//        }

        System.out.println("z".compareTo("zz"));// ?

        // căts chuỗi
        System.out.println(content.substring(10,30));

    }
}
