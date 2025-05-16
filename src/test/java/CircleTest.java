import org.example.Circle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void calculateAreaTest() {
        Circle circle = new Circle(5.6);
        double area = circle.calculateArea();
        assertEquals(5.6*5.6*Math.PI, area);
    }

    @Test
    public void calculatePerimeterTest() {
        Circle circle = new Circle(5.6);
        double perimeter = circle.calculatePerimeter();
        assertEquals(2*5.6*Math.PI, perimeter);
    }
}
