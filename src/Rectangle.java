public class Rectangle extends Shape{
    private int length;
    private int height;
    Rectangle(int x, int y, int l, int h){
        super(x,y);
        this.length = l;
        this.height = h;
    }

    float getWidth() {
        return this.length * this.height;
    }
}
