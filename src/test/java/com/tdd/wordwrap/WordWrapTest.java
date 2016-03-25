package com.tdd.wordwrap;

import org.junit.Before;
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

    private WordWrap wordWrap;

    @Before
    public void setUp(){
        wordWrap = new WordWrap();
    }

    @Test
    public void wrap_word_shorter_than_length(){
        assertThat(wordWrap.wrap("hello", 5)).isEqualTo("hello");
    }

    @Test
    public void wrap_one_word_larger_than_length(){
        assertThat(wordWrap.wrap("hello", 3)).isEqualTo("he\nllo");
    }

    @Test
    public void wrap_one_word_when_its_broken_several_times(){
        assertThat(wordWrap.wrap("hello", 1)).isEqualTo("h\ne\nl\nl\no");
    }

    @Test
    public void wrap_sentence(){
        assertThat(wordWrap.wrap("hello world", 7)).isEqualTo("hello\nworld");
    }
}
