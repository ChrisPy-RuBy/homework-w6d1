public class Classroom {

  private int roomNumber;
  private Person[] students;

public Classroom(int roomNumber) {
  this.roomNumber = roomNumber;
  this.students = new Person[30]; 
}

public int getNumber() {
  return this.roomNumber;
}

}
