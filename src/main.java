import java.util.*;

public class main {
    public static void main(String args[]) {
        PhoneBook.addNewPhoneNumber("친구", "친구1", "1000");
        PhoneBook.addNewPhoneNumber("친구", "친구2", "1001");
        PhoneBook.addNewPhoneNumber("친구", "친구3", "1002");

        PhoneBook.addNewPhoneNumber("가족", "가족1", "2000");
        PhoneBook.addNewPhoneNumber("가족", "가족1", "2001");
        PhoneBook.addNewPhoneNumber("가족", "가족1", "2002");

        HashMap friendList = PhoneBook.getCategory("친구");
        HashMap coworkerList = PhoneBook.getCategory("동료");
        System.out.println(friendList);
        System.out.println(coworkerList);
    }
}
