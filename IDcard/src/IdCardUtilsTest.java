import org.junit.Test;
import static org.junit.Assert.*;

public class IdCardUtilsTest {
    @Test
    public void testIsValidIdCard() {
        assertTrue(IdCardUtils.isValidIdCard("330825199610281021"));
        assertTrue(IdCardUtils.isValidIdCard("34120219890305363x"));
        assertFalse(IdCardUtils.isValidIdCard("123456789012345678")); // 不合法
        assertTrue(IdCardUtils.isValidIdCard("34120219890305363X"));
        assertFalse(IdCardUtils.isValidIdCard("33333082519961028102121122"));
    }

    @Test
    public void testMaskIdCard() {
        String masked = IdCardUtils.maskIdCard("330825199610281021");
        assertEquals("330825********1021", masked);
    }

    @Test
    public void testGetGender() {
        assertEquals("女", IdCardUtils.getGender("330825199610281021"));
        assertEquals("男", IdCardUtils.getGender("34120219890305363x"));
    }

    @Test
    public void testGetAge() {
        int age = IdCardUtils.getAge("330825199610281021");
        assertTrue(age >= 20 && age <= 40);
    }
}
