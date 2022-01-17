import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PhoneBook {
    static private HashMap phoneBook = new HashMap();
    public static boolean addNewPhoneNumber(String category, String name, String number) {
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
}
