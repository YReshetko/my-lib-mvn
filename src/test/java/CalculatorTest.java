import org.example.calculator.Calculator;
import org.example.calculator.Countable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @Mock
    Countable countable;

    @Test
    void SumTest(){
        Mockito.when(countable.count()).thenReturn(10L);
        Calculator calculator = new Calculator();
        long actual = calculator.sum(List.of(countable, countable));

        Assertions.assertEquals(20L , actual);
    }
}
