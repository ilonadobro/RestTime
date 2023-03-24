import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestTimeServiceTest {
    @Test
    void RestTimeYearTest() {
        RestTimeService service = new RestTimeService();

        long income = 10000;
        long expenses = 3000;
        long threshold = 20000;
        long expected = 3;

        long count = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, count);
    }

    @Test
    void RestTimeYear2Test() {
        RestTimeService service = new RestTimeService();

        long income = 100000;
        long expenses = 60000;
        long threshold = 150000;
        long expected = 2;

        long count = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, count);
    }
}
