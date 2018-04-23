package pl.sda;

public class NatoUtil {

    public String encode (String text) {
        MilitaryAlphabetEncoder militaryAlphabetEncoder = new MilitaryAlphabetEncoder();
        return militaryAlphabetEncoder.encode(text);
    }

    public String decode (String text) {
        MilitaryAlphabetDecoder militaryAlphabetDecoder = new MilitaryAlphabetDecoder();
        return militaryAlphabetDecoder.decode(text);
    }
}
