package com.tdd.wordwrap;

/**
 * Created by Ivan on 25/03/2016.
 */
public class WordWrap {


    public static final String BREAK_LINE = "\n";

    public String wrap(String text, int length) {
        if(isShorterThanLength(text, length)){
            return text;
        }

        int indexOfBreak = text.length() - length;
        String remainingText = text.substring(0, indexOfBreak);
        String brokenWord = text.substring(indexOfBreak, text.length());
        return wrap(remainingText, length) + BREAK_LINE + brokenWord;
    }

    private boolean isShorterThanLength(String text, int length) {
        return length>=text.length();
    }
}
