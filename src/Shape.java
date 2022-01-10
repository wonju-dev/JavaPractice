abstract class Shape {
    private Point point;

    Shape(int x, int y) {
        this.point = new Point(x, y);
    }

    Point getPoint(){
        return this.point;
    }
    void setPoint(Point point){
        this.point = point;
    }
    abstract float getWidth();
}
