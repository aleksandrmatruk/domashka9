import beepers.Beeper;
import engines.Engine;
import seats.Seats;

public class Bus extends Car{
    public Bus (Beeper beeper, Engine engine, Seats seats){

        super(beeper,engine,seats);
    }
    String manySeats (){
        return "Едем оптом";
    }
}
