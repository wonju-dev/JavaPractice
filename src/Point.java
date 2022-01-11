public class Point implements Cloneable{
    int x,y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return this.x + ", " + this.y;
    }

    public Point clone(){
        Point newPoint = null;
        try {
            newPoint = (Point) super.clone();
        } catch (CloneNotSupportedException e) {}
        return newPoint;
    }
}
