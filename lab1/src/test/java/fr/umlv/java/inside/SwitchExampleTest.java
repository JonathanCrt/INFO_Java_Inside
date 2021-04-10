package lab1.src.test.java.fr.umlv.java.inside;

import lab1.src.main.java.fr.umlv.java.inside.SwitchExample;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SwitchExampleTest {

    @Test
    void testDogCase() {
        assertEquals(1, SwitchExample.switchExample("dog"));
    }

    @Test
    void testCatCase() {
        assertEquals(2, SwitchExample.switchExample("cat"));
    }

    @Test
    void testDefaultCase() {
        assertEquals(4, SwitchExample.switchExample("test"));
    }

    @Test
    void shouldThrowsNPE() {
        assertThrows(NullPointerException.class, () -> SwitchExample.switchExample(null));
    }

}