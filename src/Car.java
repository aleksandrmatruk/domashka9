import beepers.Beeper;
import engines.Engine;
import seats.Seats;

public abstract class Car {

    Beeper beeper;
    Engine engine;
    Seats seats;
    public Car(Beeper beeper, Engine engine, Seats seats){
        this.beeper = beeper;
        this.engine = engine;
        this.seats = seats;


    }
}
