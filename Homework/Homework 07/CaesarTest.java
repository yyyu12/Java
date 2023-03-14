import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class CaesarTest {
    
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
            {"ABC", "XYZ"},
            {"DEFGHI", "ABCDEF"},
            {"HELLOWORLD", "EBIILTLOIA"},
            {"JACK", "GXZH"},
            {"THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG", "QEBNRFZHYOLTKCLUGRJMPLSBOQEBIXWVALD"}
        });
    }

    private String source;
    private String check;
    public CaesarTest(String source, String check) {
        this.source = source;
        this.check = check;
    }

    @Test
    public void test() {
        Caesar c = new Caesar(23);
        assertEquals(this.check, c.cipher(this.source));
    }
}
