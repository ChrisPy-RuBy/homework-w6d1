public class Bus {

  private String name;
  private Person[] passengers;

public Bus(String name) {
  this.name = name;
  this.passengers = new Person[10];
}

public String getName() {
  return this.name;
}
c 
public int passengerCount() { 
  int count = 0; 
  for (Person person: passengers) {
    if (person != null) {
      count++;
    }
  }
return count;
}

public void addPassenger(Person person) {
  if  (busIsFull()) {
    return;
  }
  int passengerCount = passengerCount();
  passengers[passengerCount()] = person;
}

public boolean busIsFull() {
  return passengerCount() == passengers.length;
}

public void emptyBusAtBusStation() {
  for (int i = 0; i < passengers.length; i++)
  {
    passengers[i] = null;
  }
}

}





// count, add, isFull methods