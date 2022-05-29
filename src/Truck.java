import beepers.Beeper;
import engines.Engine;
import seats.Seats;

public class Truck extends Car{
    public Truck (Beeper beeper, Engine engine, Seats seats){
        super(beeper,engine,seats);
    }
    String weightCapacity (){
        return "15_000 kg";
    }

}
