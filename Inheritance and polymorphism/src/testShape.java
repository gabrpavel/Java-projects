import com.gabr.corejava.*;

public class testShape {

    public static void main(String[] args) {

        var rectangle = new Rectangle(5, 9);
        var circle = new Circle(6);

        System.out.println("Area: " + rectangle.calculateArea() + "\nPerimeter: " + rectangle.calculatePerimeter());
        System.out.println("Area: " + circle.calculateArea() + "\nPerimeter: " + circle.calculatePerimeter());

    }

}
