public class Circle implements Cloneable{
    Point point;
    Circle (Point point) {
        this.point = point;
    }

    public Circle shallowClone() {
        Object newCicle = null;
        try{
            newCicle = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle) newCicle;
    }

    public Circle deepClone(){
        Object obj = null;
        try{
            obj = super.clone();
        } catch (CloneNotSupportedException e) {}
        Circle newCircle = (Circle) obj;
        newCircle.point = new Point(this.point.x, this.point.y);
        return newCircle;
    }
}
