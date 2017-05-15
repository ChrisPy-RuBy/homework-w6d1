import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {
  Bus bus;
  Person person;


@Before
public void before() {
  bus = new Bus("Number 16");
  person = new Person();  
}

@Test
public void hasName() {
  assertEquals("Number 16", bus.getName());
}
}
