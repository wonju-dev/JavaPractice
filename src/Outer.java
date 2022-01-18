class Outer {
    int val = 10;

    class Inner {
        int val = 20;

        void method(int i) {
            int val = 30;
            // i++;
            // val ++;
            MyFunction f = () -> {
                System.out.println("i : " + i);
                System.out.println("val : " + val);
                System.out.println("this.val : " + ++this.val);
                System.out.println("Outer.this.val : " + ++Outer.this.val);
            };

            f.myMethod();
        }
    }
}
