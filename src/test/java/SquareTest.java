import org.example.Square;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    @Test
    public void calculateAreaTest() {
        Square square = new Square(4.8);
        double area = square.calculateArea();
        assertEquals(4.8*4.8, area, 0.01);
    }
    @Test
    public void calculatePerimeterTest() {
        Square square = new Square(4.8);
        double perimeter = square.calculatePerimeter();
        assertEquals(4*4.8, perimeter, 0.01);
    }
}
