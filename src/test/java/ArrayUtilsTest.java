import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    // findLast tests

    @Test
    public void testFindLastNull() {
        assertThrows(NullPointerException.class, () -> ArrayUtils.findLast(null, 3));
    }

    @Test
    public void testFindLastEmpty() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{}, 3));
    }

    @Test
    public void testFindLastNotFound() {
        assertEquals(-1, ArrayUtils.findLast(new int[]{1, 2, 4}, 3));
    }

    @Test
    public void testFindLastFound() {
        assertEquals(0, ArrayUtils.findLast(new int[]{2, 3, 5}, 2));
    }

    @Test
    public void testFindLastDuplicate() {
        assertEquals(3, ArrayUtils.findLast(new int[]{2, 3, 5, 2}, 2));
    }

    // oddOrPos tests

    @Test
    public void testOddOrPosNull() {
        assertThrows(NullPointerException.class, () -> ArrayUtils.oddOrPos(null));
    }

    @Test
    public void testOddOrPosEmpty() {
        assertEquals(0, ArrayUtils.oddOrPos(new int[]{}));
    }

    @Test
    public void testOddOrPosAllPositive() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{1, 2, 3}));
    }

    @Test
    public void testOddOrPosMixed() {
        assertEquals(3, ArrayUtils.oddOrPos(new int[]{-3, -2, 0, 1, 4}));
    }

    @Test
    public void testOddOrPosNegativeEven() {
        assertEquals(0, ArrayUtils.oddOrPos(new int[]{-2, -4}));
    }

    @Test
    public void testOddOrPosNegativeOdd() {
        assertEquals(1, ArrayUtils.oddOrPos(new int[]{-3}));
    }

    @Test
    public void testOddOrPosZeroOnly() {
        assertEquals(0, ArrayUtils.oddOrPos(new int[]{0}));
    }

    // countOf tests

    @Test
    public void testCountOfEmpty() {
        assertEquals(0, ArrayUtils.countOf(new int[]{}, 5));
    }

    @Test
    public void testCountOfNotFound() {
        assertEquals(0, ArrayUtils.countOf(new int[]{1, 2, 3}, 5));
    }

    @Test
    public void testCountOfSingleMatch() {
        assertEquals(1, ArrayUtils.countOf(new int[]{1, 2, 3}, 2));
    }

    @Test
    public void testCountOfMultipleMatches() {
        assertEquals(3, ArrayUtils.countOf(new int[]{2, 1, 2, 3, 2}, 2));
    }

    @Test
    public void testCountOfAllMatch() {
        assertEquals(4, ArrayUtils.countOf(new int[]{7, 7, 7, 7}, 7));
    }
}
