package de.bentolor.java9to14samples.language;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextBlocks {
    @Test
    void testTextBlock() {
        var s1 = "function hello() {\n" +
                "   print(\"Hi, world!\");\n" +
                "}\n" +
                "   \n"  +
                "hello() "+
                ";";
        var s2 = """
            function hello() {
               print("Hi, world!");
            }
              \s
            hello() \
            ;\
            """;
        Assertions.assertEquals(s1, s2, "text blocks match!");
    }
}
