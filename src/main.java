public class main {
    public static void main(String[] args) {

        Rectangle a = new Rectangle();

        // 익명 객체 1
        Rectangle anonymous1 = new Rectangle() {

            @Override
            int get() {
                return width;
            }
        };

        System.out.println(a.get()); // 20
        System.out.println(anonymous1.get()); // 10
        System.out.println(anonymous2.get()); // 6000
        System.out.println(a.getClass() == Rectangle.class);
        System.out.println(anonymous1.getClass() == Rectangle.class);
        System.out.println(anonymous1.getClass());
        System.out.println(anonymous2.getClass() == Rectangle.class);
        System.out.println(anonymous2.getClass());


    }

    // 익명 객체 2
    static Rectangle anonymous2 = new Rectangle() {

        int depth = 30;
        @Override
        int get() {
            return width * height * depth;
        }
    };
}

class Rectangle {

    int width = 10;
    int height = 20;

    int get() {
        return height;
    }
}