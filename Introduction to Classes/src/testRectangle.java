import com.gabr.corejava.Rectangle;

public class testRectangle {

    public static void main(String[] args) {

        var rectangles = new Rectangle[3];

        rectangles[0] = new Rectangle(10, 4);
        rectangles[1] = new Rectangle(17, 15);
        rectangles[2] = new Rectangle(2, 50);

        for (int i = 0; i < rectangles.length; i++) {
            System.out.printf("Square %d : %f\n", i + 1, rectangles[i].square());
            System.out.printf("Perimeter %d : %f\n\n", i + 1, rectangles[i].perimeter());
        }

    }

}
