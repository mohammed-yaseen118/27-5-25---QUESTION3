

class RectangleArea {

    double length;
    double width;

    RectangleArea(double length, double width) {
        this.length = length;
        this.width = width;
        display();
    }

    void display() {
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}

class RectanglePerimeter extends RectangleArea {

    RectanglePerimeter(double length, double width) {
        super(length, width);
        displayRectanglePerimeter();
    }

    void displayRectanglePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

}
