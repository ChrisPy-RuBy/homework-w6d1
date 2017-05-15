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

}