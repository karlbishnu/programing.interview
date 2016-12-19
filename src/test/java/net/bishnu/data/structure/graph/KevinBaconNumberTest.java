package net.bishnu.data.structure.graph;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by karlb on 2016-12-19.
 */
public class KevinBaconNumberTest {
    @Test
    public void getBaconNumber() throws Exception {
        Assert.assertEquals(2, KevinBaconNumber.getBaconNumber("a"));
        Assert.assertEquals(2, KevinBaconNumber.getBaconNumber("b"));
        Assert.assertEquals(1, KevinBaconNumber.getBaconNumber("c"));
        Assert.assertEquals(3, KevinBaconNumber.getBaconNumber("d"));
        Assert.assertEquals(0, KevinBaconNumber.getBaconNumber("KevinBacon"));
    }

}