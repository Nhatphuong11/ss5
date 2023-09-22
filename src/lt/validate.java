package lt;

import java.util.Scanner;

public class validate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            while (true){
                int menu;
                System.out.println("Nhập số để lựa chọn thao tác muốn thực hiện từ menu dưới dây: ");
                System.out.println("1. Kiểm tra email.");
                System.out.println("2. Kiểm tra mật khẩu.");
                System.out.println("3. Kiểm tra ngày tháng.");
                System.out.println("4. Kiểm tra sdt.");
                System.out.println("5. Thoát");
                menu = sc.nextInt();
                sc.nextLine();
                switch (menu){
                    case 1:
                        System.out.println("email");
                        String email = sc.nextLine();
                        if(email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}")){
                            System.out.println("ban da nhap du");
                        }else {
                            System.out.println("ko hop le");
                        }
                        break;
                    case 2:
                        System.out.println("pass");
                        String pass = sc.nextLine();
                        if(validatePass(pass)){
                            System.out.println("ban da nhap du");
                        }else {
                            System.out.println("ko hop le");
                        }
                        break;
                    case 3:
                        System.out.println("date");
                        String date = sc.nextLine();
                        if(validateDate(date)){
                            System.out.println("ban da nhap du");
                        }else {
                            System.out.println("ko hop le");
                        }
                        break;
                    case 4:
                        System.out.println("Phone");
                        String phone = sc.nextLine();
                        if(validatePhone(phone)){
                            System.out.println("ban da nhap du");
                        }else {
                            System.out.println("ko hop le");
                        }
                        break;
                    case 5:
                        System.out.println("exit");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("nhập sai");
                }
            }
        }

//    public static boolean validateEmail(String email){
//        return email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}");
//    }
    public static boolean validatePass(String pass){
        return pass.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
    }
    public static boolean validateDate(String date){
        return date.matches("(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])/(0[1-9]|1[0-2]|[1-9])/([0-9]{4})");
    }
    public static boolean validatePhone(String phone) {
        return phone.matches("^\\+84[35789][0-9]{8}$");
    }
}
