import beepers.Beeper;
import engines.Engine;
import seats.Seats;

public class Lambo extends Car{
    public Lambo(Beeper beeper, Engine engine, Seats seats) {
        super(beeper, engine, seats);
    }
    String getCoast (){
        return "1_000_000$";

    }

}
