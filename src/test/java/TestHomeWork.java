import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.getjava.core.homework.HomeWork1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestHomeWork {

    private HomeWork1 homeWork1 = null;
    private List<String> names;

    @Before
    public void prepareTestData() {
        homeWork1 = new HomeWork1();
        names = Stream
                .of("Denis", "Alex and Cate", "Николай", "", null)
                .collect(Collectors.toList());
    }

    @Test
    public void testHomeWork1() {

        names.stream().forEach(
                name -> Assert.assertEquals(
                        "HomeWork1 - Check Greeting - Test",
                        "Hello, " + name + "!",
                        homeWork1.greeting(name)
                )
        );

    }

}
