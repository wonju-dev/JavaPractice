import java.util.*;

public class main {
    public static void main(String args[]) {
        PhoneBook.addNewPhoneNumber("친구", new Person("친구1", "1000"));
        PhoneBook.addNewPhoneNumber("친구", new Person("친구2", "1001"));
        PhoneBook.addNewPhoneNumber("친구", new Person("친구3", "1002"));

        PhoneBook.addNewPhoneNumber("가족", new Person("가족1", "2000"));
        PhoneBook.addNewPhoneNumber("가족", new Person("가족2", "2001"));
        PhoneBook.addNewPhoneNumber("가족", new Person("가족3", "2002"));
        HashMap friendList = PhoneBook.getCategory("친구");
        HashMap coworkerList = PhoneBook.getCategory("동료");
        System.out.println(friendList);
        System.out.println(coworkerList);

        try {
            String number1 = PhoneBook.findWithName("친구1");
            System.out.printf("%s %s \n", "친구1", number1);
            String number2 = PhoneBook.findWithName("깐부1");
            System.out.printf("%s %s", "깐부1", number2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
