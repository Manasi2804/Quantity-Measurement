package com.bl.quantitymeasurement;

import com.bl.quantitymeasurment.QuantityMeasurement;
import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
    @Test
    public void givenFeetValue_WhenEqual_ShouldReturnTrue() {
        Feet f1 = new Feet(0.0);
        Feet f2 = new Feet(0.0);
        String result1 = quantityMeasurement.compare(f1, f2);
        Assert.assertEquals("equal", result1);
    }
}