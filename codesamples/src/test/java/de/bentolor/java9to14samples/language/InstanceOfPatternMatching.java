package de.bentolor.java9to14samples.language;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class InstanceOfPatternMatching {


    @Test
    void instanceOfPatternMatching() {
        Object obj = "Foo";
        if (obj instanceof String s) {
            s.toLowerCase();
        } else {
            // can't use s here
        }
    }

    String s = "123";
    @Test
    void bindingVarScoping() {
        var obj = Math.random() < 0.5 ? "Oh Magic!" : 9;
        if (!(obj instanceof String s)) {
            assertEquals("123", s);
        } else {
            assertEquals("Oh Magic!", s);
        }
        if (obj instanceof String s && s.length() > 5) {
            assertEquals("Oh Magic!", s);
        } else {
            assertEquals("123", s);
        }
        if (obj instanceof String s || s.length() < 5) {
            assertEquals("123", s);
        } else {
            assertEquals("123", s);
        }
    }
}


