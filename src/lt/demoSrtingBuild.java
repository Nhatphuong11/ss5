package lt;
import java.util.Arrays;
import java.util.Scanner;
public class demoSrtingBuild {
    public static void main(String[] args) {
        System.out.println(validateUsername("HHsjbjsfbsH"));

        // yêu cầu nâng cao :
        // tạo lớp Validation kiểm tra sự chính xác của các dữ liệu sau :
        // email : gmail.com
        // số điện thoai : vietnam
        // mật khẩu : bảo mật cao
        // ngày tháng năm : dd/MM/yyyy
        // validate chuỗi nhập vào có phải
        // là số không  "217864" : bắt người dùng nhập đến khi nhập đúng số
        // thị mới hiển thị, nếu ko là số thì nhâp lại ;

        System.out.println("email");
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();
        if(validateEmail(email)){
            System.out.println("ban da nhap du");
        }else {
            System.out.println("ko hop le");
        }
    }
    public static boolean validateUsername(String username){
        // yêu cầu : 8-12 kí tự , ko kí tự đặc biệt ko có khoảng trắng , bắt đàu chữ in hoa
//        String pattern = "^[A-Z]{1}[a-zA-Z0-9&&\\S]{7,11}$";
//        Pattern patt = Pattern.compile(pattern);
//        Matcher math = patt.matcher(username);
//        return math.matches();
//        return Pattern.matches("^[A-Z]{1}[a-zA-Z0-9&&\\S]{7,11}$",username);
        return username.matches("^[A-Z]{1}[a-zA-Z0-9&&\\S]{7,11}$");
    }
    public static boolean validateEmail(String email){
        return email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");
    }
}
