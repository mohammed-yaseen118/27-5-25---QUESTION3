

public class CircleArea {
    final float PI = 3.14f;
    float radius;

    void Bcalculate(float radius) {
        System.out.println("The area of the circle is: " + (PI * radius * radius));
        System.out.println("The perimeter of the circle is: " + (2 * PI * radius));
    }

    public CircleArea(float radius) {
        this.radius = radius;
        Bcalculate(radius);

    }

    public static void main(String[] args) {
        RectanglePerimeter rp = new RectanglePerimeter(5, 3);
        CircleArea c = new CircleArea(0.5f);
    }
}
