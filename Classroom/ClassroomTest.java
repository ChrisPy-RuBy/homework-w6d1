import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ClassroomTest {
  Classroom classroom;
  Person person;

@Before 
public  void before() {
  classroom = new Classroom (2);
  person = new Person();
}

@Test
public void hasInt(){
  assertEquals(2, classroom.getNumber());
}

}