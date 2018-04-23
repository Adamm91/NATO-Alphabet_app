package pl.sda;

import org.junit.Assert;
import org.junit.Test;

public class NatoUtilTest {


    @Test
    public void encode() {
        // given
        NatoUtil natoUtil = new NatoUtil();
        //when
        String expectedResult = "Alpha Delta Alpha Mike";
        String textToEncode = natoUtil.encode("Adam");
        //then
        Assert.assertEquals(expectedResult, textToEncode);
    }

    @Test
    public void decode() {
        NatoUtil natoUtil = new NatoUtil();
        String expectedResult = "ADAM";
        String textToDecode = natoUtil.decode("Alpha Delta Alpha Mike");
        Assert.assertEquals(expectedResult, textToDecode);
    }

    @Test
    public void encodeFewWords() {
        // given
        NatoUtil natoUtil = new NatoUtil();
        //when
        String expectedResult = "Alpha Delta Alpha Mike / Sierra Delta Alpha";
        String textToEncode = natoUtil.encode("Adam Sda");
        //then
        Assert.assertEquals(expectedResult, textToEncode);
    }

    @Test
    public void decodeFewWords() {
        NatoUtil natoUtil = new NatoUtil();
        String expectedResult = "ADAM SDA";
        String textToDecode = natoUtil.decode("Alpha Delta Alpha Mike / Sierra Delta Alpha");
        Assert.assertEquals(expectedResult, textToDecode);
    }

}
