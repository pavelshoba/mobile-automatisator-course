import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        String class_string = this.getClassString();

        System.out.println (class_string.contains("Hello") || class_string.contains("hello"));
    }
}