import java.util.*;

public class PhoneBook {
    static private HashMap phoneBook = new HashMap();
    public static boolean addNewPhoneNumber(String category, Person person) {
        String name = person.getName();
        String number = person.getNumber();

        if (!phoneBook.containsKey(category)) {
            HashMap newCategory = new HashMap();
            newCategory.put(name, number);
            phoneBook.put(category, newCategory);
            return true;
        } else {
            HashMap foundCategory = (HashMap) phoneBook.get(category);
            if (foundCategory.containsKey(name)) return false;
            foundCategory.put(name, number);
            phoneBook.put(category, foundCategory);
            return true;
        }
    }
    public static HashMap getCategory(String category) {
        HashMap foundCategory = (HashMap) phoneBook.get(category);
        if (foundCategory != null) return foundCategory;
        else return new HashMap();
    }

    public static String findWithName(String name) throws Exception{
        Collection categories = phoneBook.values();
        Iterator it = categories.iterator();
        while (it.hasNext()) {
            HashMap category = (HashMap) it.next();
            String number = (String) category.get(name);
            if (number != null) return number;
        }
        throw new Exception("not found");
    }
}
