import java.util.*;

public class main {
    public static void main(String args[]) {
        Properties properties = new Properties();
        properties.setProperty("pro1", "value1");
        properties.setProperty("pro2", "value2");
        properties.setProperty("pro3", "value3");

        Enumeration e = properties.propertyNames();

        while (e.hasMoreElements()) {
            String element = (String) e.nextElement();
            System.out.printf("%s %s \n", element, properties.getProperty(element));
        }

    }
}
