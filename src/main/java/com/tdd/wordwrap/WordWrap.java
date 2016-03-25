package com.tdd.wordwrap;

/**
 * Created by Ivan on 25/03/2016.
 */
public class WordWrap {


    public static final String BREAK_LINE = "\n";
    public static final char WHITE_SPACE = ' ';

    public String wrap(String text, int length) {
        if(isShorterThanLength(text, length)){
            return text;
        }

        int indexOfBreak = text.length() - length;
        String brokenWord = text.substring(indexOfBreak, text.length());

        if(hasWhiteSpace(brokenWord)){
            indexOfBreak = indexOfWhiteSpace(indexOfBreak, brokenWord);
            brokenWord = text.substring(indexOfBreak+1, text.length());
        }

        String remainingText = text.substring(0, indexOfBreak);
        return wrap(remainingText, length) + BREAK_LINE + brokenWord;
    }

    private int indexOfWhiteSpace(int indexOfBreak, String brokenWord) {
        return indexOfBreak + brokenWord.indexOf(' ');
    }

    private boolean hasWhiteSpace(String brokenWord) {
        return brokenWord.indexOf(WHITE_SPACE)!=-1;
    }

    private boolean isShorterThanLength(String text, int length) {
        return text==null || length>=text.length();
    }
}
