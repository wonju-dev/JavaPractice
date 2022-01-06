public class Circle extends Shape{
    int radius;

    Circle(){
        this(100);
    }

    Circle(int radius) {
        this.radius = radius;
        this.length = 0;
        this.height = 0;
    }

    int getWidth() {
        return this.radius * this.radius;
    }
}
