package edu.um.mt.csa2181;

/**
 * Created with IntelliJ IDEA.
 * User: Mark
 * Date: 19/10/12
 * TimeUnit: 11:08
 * To change this template use File | Settings | File Templates.
 */
public enum TimeUnit {

    DAY(86400000), HOUR(3600000), MINUTE(60000), SECOND(1000);

    private long millis;

    TimeUnit(long millis) {
        this.millis = millis;
    }

    public long getMillis() {
        return millis;
    }
}
