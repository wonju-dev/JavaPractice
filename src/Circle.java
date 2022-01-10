class Circle extends Shape {
    private int radius;

    Circle() {
        this(0, 0, 1);
    }

    Circle(int x) {
        this(x, x,1);
    }

    Circle(int x, int r) {
        this(x, x, r);
    }

    Circle(int x, int y, int r) {
        super(x,y);
        this.radius = r;
    }

    float getWidth(){
        return this.radius * this.radius;
    }

}
