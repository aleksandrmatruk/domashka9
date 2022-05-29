import beepers.Beeper;
import beepers.Horn;
import beepers.MagicSound;
import beepers.TrainHorn;
import engines.Engine;
import engines.EngineV12;
import engines.EngineV6;
import seats.Seats;
import seats.Seats_10;
import seats.Seats_2;
import seats.Seats_5;

public class Main {

    public static void main(String[] args) {
        Beeper horn = new Horn();
        EngineV12 engineV12 = new EngineV12();
        Seats seats_2 = new Seats_2();
        Seats seats_10 = new Seats_10();
        Lambo lambo = new Lambo(horn, engineV12,seats_2);
        Beeper magicSound = new MagicSound();
        Engine engineV6 = new EngineV6();
        Seats seats_5 = new Seats_5();
        Priora priora = new Priora(magicSound,engineV6, seats_5);
        Beeper trainHorn = new TrainHorn();
        Truck truck = new Truck(trainHorn,engineV6,seats_2);
        Bus bus = new Bus(trainHorn,engineV6,seats_10);

        System.out.println(bus.beeper.makeSound());
        System.out.println(bus.engine.getSpeed());
        System.out.println(bus.seats.numberSeats());
        System.out.println(bus.manySeats());
        System.out.println();

        System.out.println(truck.beeper.makeSound());
        System.out.println(truck.engine.getSpeed());
        System.out.println(truck.seats.numberSeats());
        System.out.println(truck.weightCapacity());
        System.out.println();


        System.out.println(lambo.beeper.makeSound());
        System.out.println(lambo.engine.getSpeed());
        System.out.println(lambo.getCoast());
        System.out.println(lambo.seats.numberSeats());
        System.out.println();

        System.out.println(priora.beeper.makeSound());
        System.out.println(priora.engine.getSpeed());
        System.out.println(priora.downShifting());
        System.out.println(priora.seats.numberSeats());
        System.out.println();




    }
}