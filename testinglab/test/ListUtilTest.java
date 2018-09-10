import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;
/**
 *This class is for testing the ListUtil method countUnique
 * and binarySearch.
 *
 * @author Thanapoom Rattanathumawat
 */
public class ListUtilTest {

    @Test
    public void testUniqueValue() {
        List<String> uniqueTest =  new ArrayList<>();
        uniqueTest.add("a");
        uniqueTest.add("a");
        uniqueTest.add("b");
        uniqueTest.add("b");
        uniqueTest.add("c");

        assertEquals(3,ListUtil.countUnique(uniqueTest));
    }

    @Test
    public void testLargeList() {
        List<Integer> uniqueTest =  new ArrayList<>(10);
        uniqueTest.add(1);
        uniqueTest.add(3);
        uniqueTest.add(4);
        uniqueTest.add(null);
        uniqueTest.add(5);
        uniqueTest.add(6);
        uniqueTest.add(5);
        uniqueTest.add(6);
        uniqueTest.add(7);
        uniqueTest.add(8);
        // Only 8 unique values.

        assertEquals(8,ListUtil.countUnique(uniqueTest));
    }

    @Test
    public void testEmpty() {
        List<String> uniqueTest =  new ArrayList<>();
        assertEquals(0,ListUtil.countUnique(uniqueTest));
    }

    @Test(expected = NullPointerException.class)
    public void testNull() {
        List<String> uniqueTest =  null;
        assertEquals(NullPointerException.class,ListUtil.countUnique(uniqueTest));
    }

    @Test
    public void testIndexOfElement() {
        String[] binaryTest = {"Cat","Dog","Fish"};

        assertEquals(0,ListUtil.binarySearch(binaryTest,"Cat"));
        assertEquals(1,ListUtil.binarySearch(binaryTest,"Dog"));
        assertEquals(2,ListUtil.binarySearch(binaryTest,"Fish"));
    }


    @Test(expected = AssertionError.class)// Binary search is only used for unique arrays.
    public void testMultipleElement() {
        String[] binaryTest = {"Cat","Dog","Dog","Dog","Fish"};

        assertNotEquals(2,ListUtil.binarySearch(binaryTest,"Dog"));
        assertNotEquals(3,ListUtil.binarySearch(binaryTest,"Dog"));
    }

    @Test
    public void testNoElement() {
        String[] binaryTest = {"Cat","Dog","Dog","Dog","Fish"};

        assertEquals(-1,ListUtil.binarySearch(binaryTest, "Apple"));
    }
}
