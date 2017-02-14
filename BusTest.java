import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class BusTest{
  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus(22);
    person = new Person("Ryan");
  }

  @Test
  public void hasNumber(){
    assertEquals(22, bus.getNumber());
  }

  @Test
  public void checkBusEmpty(){
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void testAddToBus(){
    bus.add(person);

    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void testAddLotsToBus(){
    bus.add(person);
    bus.add(person);
    bus.add(person);
    bus.add(person);
    bus.add(person);

    assertEquals(5, bus.passengerCount());
  }

  @Test
  public void testBusIsFull(){
    bus.add(person);
    bus.add(person);
    bus.add(person);
    bus.add(person);
    bus.add(person);

    assertEquals(true, bus.busIsFull());

  }

}