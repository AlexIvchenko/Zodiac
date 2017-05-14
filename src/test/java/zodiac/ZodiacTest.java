package zodiac;

import org.junit.Assert;
import org.junit.Test;

public class ZodiacTest {
    @Test(expected = IllegalArgumentException.class)
    public void fromWithZeroMonth() throws Exception {
        Zodiac.from(0, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromWithInvalidMonth() throws Exception {
        Zodiac.from(13, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromWithZeroDayOfMonth() throws Exception {
        Zodiac.from(1, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void fromWithInvalidDayOfMonth() throws Exception {
        Zodiac.from(1, 32);
    }

    @Test
    public void fromAquariusDate() throws Exception {
        Zodiac zodiac = Zodiac.AQUARIUS;
        Assert.assertEquals(Zodiac.from(1, 20), zodiac);
        Assert.assertEquals(Zodiac.from(1, 31), zodiac);
        Assert.assertEquals(Zodiac.from(2, 1), zodiac);
        Assert.assertEquals(Zodiac.from(2, 18), zodiac);
    }

    @Test
    public void fromPiscesDate() throws Exception {
        Zodiac zodiac = Zodiac.PISCES;
        Assert.assertEquals(Zodiac.from(2, 19), zodiac);
        Assert.assertEquals(Zodiac.from(2, 31), zodiac);
        Assert.assertEquals(Zodiac.from(3, 1), zodiac);
        Assert.assertEquals(Zodiac.from(3, 20), zodiac);
    }

    @Test
    public void fromAriesDate() throws Exception {
        Zodiac zodiac = Zodiac.ARIES;
        Assert.assertEquals(Zodiac.from(3, 21), zodiac);
        Assert.assertEquals(Zodiac.from(3, 31), zodiac);
        Assert.assertEquals(Zodiac.from(4, 1), zodiac);
        Assert.assertEquals(Zodiac.from(4, 19), zodiac);
    }

    @Test
    public void fromTaurusDate() throws Exception {
        Zodiac zodiac = Zodiac.TAURUS;
        Assert.assertEquals(Zodiac.from(4, 20), zodiac);
        Assert.assertEquals(Zodiac.from(4, 31), zodiac);
        Assert.assertEquals(Zodiac.from(5, 1), zodiac);
        Assert.assertEquals(Zodiac.from(5, 20), zodiac);
    }

    @Test
    public void fromGeminiDate() throws Exception {
        Zodiac zodiac = Zodiac.GEMINI;
        Assert.assertEquals(Zodiac.from(5, 21), zodiac);
        Assert.assertEquals(Zodiac.from(5, 31), zodiac);
        Assert.assertEquals(Zodiac.from(6, 1), zodiac);
        Assert.assertEquals(Zodiac.from(6, 20), zodiac);
    }

    @Test
    public void fromCancerDate() throws Exception {
        Zodiac zodiac = Zodiac.CANCER;
        Assert.assertEquals(Zodiac.from(6, 21), zodiac);
        Assert.assertEquals(Zodiac.from(6, 31), zodiac);
        Assert.assertEquals(Zodiac.from(7, 1), zodiac);
        Assert.assertEquals(Zodiac.from(7, 22), zodiac);
    }

    @Test
    public void fromLeoDate() throws Exception {
        Zodiac zodiac = Zodiac.LEO;
        Assert.assertEquals(Zodiac.from(7, 23), zodiac);
        Assert.assertEquals(Zodiac.from(7, 31), zodiac);
        Assert.assertEquals(Zodiac.from(8, 1), zodiac);
        Assert.assertEquals(Zodiac.from(8, 22), zodiac);
    }

    @Test
    public void fromVirgoDate() throws Exception {
        Zodiac zodiac = Zodiac.VIRGO;
        Assert.assertEquals(Zodiac.from(8, 23), zodiac);
        Assert.assertEquals(Zodiac.from(8, 31), zodiac);
        Assert.assertEquals(Zodiac.from(9, 1), zodiac);
        Assert.assertEquals(Zodiac.from(9, 22), zodiac);
    }

    @Test
    public void fromLibraDate() throws Exception {
        Zodiac zodiac = Zodiac.LIBRA;
        Assert.assertEquals(Zodiac.from(9, 23), zodiac);
        Assert.assertEquals(Zodiac.from(9, 31), zodiac);
        Assert.assertEquals(Zodiac.from(10, 1), zodiac);
        Assert.assertEquals(Zodiac.from(10, 22), zodiac);
    }

    @Test
    public void fromScorpioDate() throws Exception {
        Zodiac zodiac = Zodiac.SCORPIO;
        Assert.assertEquals(Zodiac.from(10, 23), zodiac);
        Assert.assertEquals(Zodiac.from(10, 31), zodiac);
        Assert.assertEquals(Zodiac.from(11, 1), zodiac);
        Assert.assertEquals(Zodiac.from(11, 21), zodiac);
    }

    @Test
    public void fromSagittariusDate() throws Exception {
        Zodiac zodiac = Zodiac.SAGITTARIUS;
        Assert.assertEquals(Zodiac.from(11, 22), zodiac);
        Assert.assertEquals(Zodiac.from(11, 31), zodiac);
        Assert.assertEquals(Zodiac.from(12, 1), zodiac);
        Assert.assertEquals(Zodiac.from(12, 21), zodiac);
    }

    @Test
    public void fromCapricornDate() throws Exception {
        Zodiac zodiac = Zodiac.CAPRICORN;
        Assert.assertEquals(Zodiac.from(12, 22), zodiac);
        Assert.assertEquals(Zodiac.from(12, 31), zodiac);
        Assert.assertEquals(Zodiac.from(1, 1), zodiac);
        Assert.assertEquals(Zodiac.from(1, 19), zodiac);
    }
}