import org.junit.jupiter.api.Test;

import org.example.Rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    public void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(1.0, 2.0);
        double area = rectangle.calculateArea();
        assertEquals(2, area);
    }

    @Test
    public void calculatePerimeterTest() {
        Rectangle rectangle = new Rectangle(1,2);
        double perimeter = rectangle.calculatePerimeter();
        assertEquals(6, perimeter, 0.01);
    }
}
