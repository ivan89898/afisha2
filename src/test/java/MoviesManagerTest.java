import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoviesManagerTest {
    @Test
    public void testAll() {
        MoviesManager manager = new MoviesManager();
        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testAllZero() {
        MoviesManager manager = new MoviesManager();
        manager.add(null);
        String[] expected = {null};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastFifteen() {
        MoviesManager manager = new MoviesManager(15);
        manager.add(String.valueOf(40));

        String[] expected = {String.valueOf(40)};
        String[] actual = manager.findLast(15);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastFive() {
        MoviesManager manager = new MoviesManager(5);
        manager.add(String.valueOf(5));

        String[] expected = {String.valueOf(5)};
        String[] actual = manager.findLast(5);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastZero() {
        MoviesManager manager = new MoviesManager(1);
        manager.add(String.valueOf(0));

        String[] expected = {String.valueOf(0)};
        String[] actual = manager.findLast(1);
        assertArrayEquals(expected, actual);
    }
}


