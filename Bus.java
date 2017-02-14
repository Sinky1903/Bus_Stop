import java.util.ArrayList;

public class Bus {
  private int number;
  private ArrayList<Person> passenger;

  public Bus(int number) {
    this.number = number;
    this.passenger = new ArrayList<Person>();
  }

  public int getNumber(){
    return this.number;
  }

  public int passengerCount(){
    return passenger.size();
  }

  public void add(Person person){
    passenger.add(person);
  }

  public void remove(Person person){
    passenger.remove(person);
  }

  public boolean busIsFull(){
    return passenger.size()>=5;
  }
}