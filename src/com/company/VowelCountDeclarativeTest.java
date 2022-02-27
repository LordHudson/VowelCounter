package com.company;

import static org.junit.jupiter.api.Assertions.*;

class VowelCountDeclarativeTest {

    @org.junit.jupiter.api.Test
    void getCount() {
        assertEquals(7,VowelCountDeclarative.getCount("I am Lord Hudson The first"));
        assertEquals(5,VowelCountDeclarative.getCount("aeiou"));
        assertEquals(2,VowelCountDeclarative.getCount("king kong"));
        assertEquals(7,VowelCountDeclarative.getCount("Once Upon A Time"));
        assertEquals(7,VowelCountDeclarative.getCount("House of The Dragon"));
    }
}