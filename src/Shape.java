public class Shape {
    int length;
    int height;

    Shape(){
        this(100,100);
    }

    Shape(int length, int height) {
        this.length = length;
        this.height = height;
    }

    int getWidth(){
        return this.length * this.height;
    }
}
