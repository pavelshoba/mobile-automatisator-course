import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void  testGetClassNumber() {
        int class_number = this.getClassNumber();

        if (class_number > 45) {
            System.out.println("Метод возвращает число больше 45");
        } else {
            System.out.println("Метод вовращает число меньше 45");
        }
    }
}