class Circle extends Shape{
    final int RADIUS;

    Circle(){
        this.RADIUS = 100;
    }

    Circle(int RADIUS) {
        this.RADIUS = RADIUS;
    }

    int getWidth() {
        return this.RADIUS;
    }
}
