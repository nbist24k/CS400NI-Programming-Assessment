public class ShapeApp {
    public static void main(String[] args) {

        // Array of Shape objects (Abstraction)
        Shape[] shapes = new Shape[2];

        shapes[0] = new Rectangle(5, 3);
        shapes[1] = new Circle(4);

        for (Shape s : shapes) {
            s.displayShapeInfo();
            System.out.println("Area: " + s.calculateArea());
            System.out.println("Perimeter: " + s.calculatePerimeter());

            // Casting to access draw()
            Drawable d = (Drawable) s;
            d.draw();

            System.out.println("-------------------");
        }
    }
}