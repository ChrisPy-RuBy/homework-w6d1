import static org.junit.Assert.assertEquals;
import org.junit.*;

 

@Test
public void hasName() {
  assertEquals("Number 16", bus.getName());
}

@Test
public void emptyBus() {
  assertEquals(0, bus.passengerCount());
}

@Test
public void addPassenger() {
  bus.addPassenger(person);
  assertEquals(1, bus.passengerCount());
}

@Test 
public void busIsFull() {
  for(int i=0; i<10; i++) {
    bus.addPassenger(person);
  }
assertEquals(true, bus.busIsFull());
}

@Test 
public void emptyBusAtBusStation() {
  bus.addPassenger(person);
  bus.emptyBusAtBusStation();
  assertEquals(0, bus.passengerCount());
}  

}


