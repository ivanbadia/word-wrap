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

        String brokenWord = text.substring(indexOfBreak, text.length());
        if(brokenWord.indexOf(' ')!=-1){
            indexOfBreak = indexOfBreak + brokenWord.indexOf(' ');
            brokenWord = text.substring(indexOfBreak+1, text.length());
        }

        String remainingText = text.substring(0, indexOfBreak);
        return wrap(remainingText, length) + BREAK_LINE + brokenWord;
    }

    private boolean isShorterThanLength(String text, int length) {
        return length>=text.length();
    }
}
