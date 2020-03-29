import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.getjava.core.homework.HomeWork1;

public class TestHomeWork {

    private HomeWork1 homeWork1 = null;

    @Before
    public void prepareTestData() {
        homeWork1 = new HomeWork1();
    }

    @Test
    public void testHomeWork1() {
        Assert.assertEquals("Home work 1 - TEST","HomeWork run", homeWork1.getHomeWorkText());
    }

}
