import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeUtilTest {
    @Test
    public void calculateAreaTest() {
        Shape[] shapes = {new Rectangle(2,4),
                new Circle(1),
                new Square(5)};

        ShapeUtil shapeUtil = new ShapeUtil();
        double area = shapeUtil.calculateArea(shapes);
        assertEquals(36.14, area, 0.1);
    }

    @Test
    public void calculatePerimeterTest() {
        Shape[] shapes = {new Rectangle(2,4),
                new Circle(1),
                new Square(5)};

        ShapeUtil shapeUtil = new ShapeUtil();
        double perimeter = shapeUtil.calculatePerimeter(shapes);
        assertEquals(38.28, perimeter, 0.1 );
    }
}
