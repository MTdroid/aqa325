import academy.kata.BoundaryService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class BoundaryServiceTest {
    BoundaryService boundaryService = new BoundaryService();

    @Test
    public void findmin() {
        int[] array = {3,2,1,6,5,1,4,4};
        int bsResult = boundaryService.findMin(array);
        int testResult = Arrays.stream(array).min().getAsInt();
        assertEquals(testResult,bsResult);
    }

    @Test
    public void findminnn() {
        int[] array = {0,1,0,0,2,2};
        int bsResult = boundaryService.findMin(array);
        int testResult = Arrays.stream(array).min().getAsInt();
        assertEquals(testResult,bsResult);
    }
}





