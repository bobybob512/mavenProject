package dataproviders;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestSumWithDataProvider {

    @DataProvider(name = "sumDataProvider")
    public Iterator<Object[]> testSum() {
        Collection<Object[]> dp = new ArrayList<Object[]>();
        dp.add(new Integer[]{3, 1, 2});
        dp.add(new Integer[]{4, 2, 2});
        dp.add(new Integer[]{5, 2, 3});
        return dp.iterator();
    }

    public int sum(int a, int b) {
        return a + b;
    }

    @Test(dataProvider = "sumDataProvider")
    public void testSum(int exp, int a, int b) {
        Assert.assertEquals(exp, sum(a, b));
    }
}
