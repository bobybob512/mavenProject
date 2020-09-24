package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cockroach {

    private int cockroachSpeed(double v) {
        double x = (v * 100000) / 3600;

        return (int)x;

    }

    @Test
    public void basicTests() throws Exception {
        assertEquals(30, cockroachSpeed(1.08));
        assertEquals(30, cockroachSpeed(1.09));
        assertEquals(0, cockroachSpeed(0));
    }


}

    
