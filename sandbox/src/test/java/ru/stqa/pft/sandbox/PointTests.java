package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PointTests {

    @Test
    public void testCorrectPoint() {
        Point a = new Point(-1, 3);
        Point b = new Point(6, 2);

        assertEquals(a.distance(b), 7.0710678118654755);
    }
}
