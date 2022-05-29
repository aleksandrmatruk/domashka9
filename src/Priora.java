import beepers.Beeper;
import engines.Engine;
import seats.Seats;

public class Priora extends Car{
    public Priora(Beeper beeper, Engine engine, Seats seats) {
        super(beeper, engine, seats);
    }
    String downShifting (){
        return "Занижена";

    }
}
