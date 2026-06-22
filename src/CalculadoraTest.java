import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testeSoma() {
        assertEquals(10, calc.soma(5, 5));
    }

    @Test
    void testeDivisao() {
        assertEquals(5, calc.divisao(10, 2));
    }

    @Test
    void testeDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.divisao(10, 0);
        });
    }
}