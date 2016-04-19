package edu.um.mt.csa2181;

import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Mark
 * Date: 19/10/12
 * TimeUnit: 11:08
 * To change this template use File | Settings | File Templates.
 */
public class JodaWrapper {

    public Date addToDate(Date date, TimeUnit timeUnit, int quantity) {
        DateTime dateTime = new DateTime(date);
        dateTime = dateTime.plus(timeUnit.getMillis() * quantity);

        return dateTime.toDate();
    }
}
