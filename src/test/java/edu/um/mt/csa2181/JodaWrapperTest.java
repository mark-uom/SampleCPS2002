package edu.um.mt.csa2181;

import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Mark
 * Date: 19/10/12
 * Time: 11:14
 * To change this template use File | Settings | File Templates.
 */
public class JodaWrapperTest {

    private JodaWrapper wrapper;
    private Date now;

    @Before
    public void before() {
        wrapper = new JodaWrapper();
        now = new Date();
    }

   /* @Test
    public void addSecond() {
        Date jodaObtained = wrapper.addToDate(now, TimeUnit.SECOND, 1);
        assertEquals("Time is the same: ", jodaObtained.getTime(), now.getTime() + 1001);
    }*/

    @Test
    public void addMinute() {
        Date jodaObtained = wrapper.addToDate(now, TimeUnit.MINUTE, 1);
        assertEquals("Time is the same: ", jodaObtained.getTime(), now.getTime() + (1000 * 60));
    }

    @Test
    public void addHour() {
        Date jodaObtained = wrapper.addToDate(now, TimeUnit.HOUR, 1);
        assertEquals("Time is the same: ", jodaObtained.getTime(), now.getTime() + (1000 * 60 * 60));
    }

    @Test
    public void addDay() {
        Date jodaObtained = wrapper.addToDate(now, TimeUnit.DAY, 1);
        assertEquals("Time is the same: ", jodaObtained.getTime(), now.getTime() + (1000 * 60 * 60 * 24));
    }


}
