import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {

    @Test
    void add() {
        Array<Integer> intArrList = new Array<> ();

        intArrList.add(2);
        intArrList.add(3);
        intArrList.add(5);

        assertEquals(3,intArrList.getByIndex(1));
    }

    @Test
    void capacity() {
        Array<Integer> intArrList = new Array<> ();

        intArrList.add(2);
        intArrList.add(3);
        intArrList.add(5);

        assertEquals(3,intArrList.capacity());
    }

    @Test
    void getByIndex() {
        Array<Integer> intArrList = new Array<> ();

        intArrList.add(2);
        intArrList.add(3);
        intArrList.add(5);

        assertEquals(5,intArrList.getByIndex(2));
    }

    @Test
    void remove() {
        Array<Integer> intArrList = new Array<> ();

        intArrList.add(2);
        intArrList.add(3);
        intArrList.add(5);

        intArrList.remove(0);
        assertEquals(3,intArrList.getByIndex(0));
    }
}
