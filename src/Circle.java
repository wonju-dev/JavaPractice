public class Circle implements Cloneable{
    Point point;
    Circle (Point point) {
        this.point = point;
    }

    public Circle clone() {
        Object newCicle = null;
        try{
            newCicle = super.clone();
        } catch (CloneNotSupportedException e) {}
        return (Circle) newCicle;
    }
}
