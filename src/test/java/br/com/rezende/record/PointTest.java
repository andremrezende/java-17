package br.com.rezende.record;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void classTest() {
        //GIVEN
        Point point = new Point(10,20,30);

        //THEN
        assertEquals(10, point.x());
        assertEquals(20, point.y());
        assertEquals(30, point.z());
    }

    @Test
    public void recordTest() {
        //GIVEN
        PointRecord point = new PointRecord(10,20,30);

        //THEN
        assertEquals(10, point.x());
        assertEquals(20, point.y());
        assertEquals(30, point.z());
    }

}
