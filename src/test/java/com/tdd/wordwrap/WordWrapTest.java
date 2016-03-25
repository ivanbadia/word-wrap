package com.tdd.wordwrap;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Ivan on 25/03/2016.
 */
public class WordWrapTest {

    /**
     * TO-DO
     *
     * hello, 5 -> hello
     * hello, 3 -> he\nllo
     * hello, 1 -> h\ne\nl\nl\no
     * hello world, 7 -> hello\nworld
     * hello world today, 6 -> hello\nworld\ntoday
     */

    @Test
    public void wrap_word_shorter_than_width(){
        assertThat(wrap("hello", 5)).isEqualTo("hello");
    }

    @Test
    public void wrap_one_word_larger_than_width(){
        assertThat(wrap("hello", 3)).isEqualTo("he\nllo");
    }

    private String wrap(String text, int width) {
        if(width>text.length()){
            return text;
        }

        return text.substring(0, text.length()-width)+"\n"+text.substring(text.length()-width, text.length());
    }
}
