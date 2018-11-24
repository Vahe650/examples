package chapter10.event;

public class GreenHouseController {
    public static void main(String[] args) {
        GreenHouseControls gc=new GreenHouseControls();
        ExtendClass ec=new ExtendClass();
        gc.addEvent(gc.new Bell(900));
        Event [] events={gc.new ThermostatNight(0),
                gc.new LightOn(200),
                gc.new LightOff(400),
                gc.new ConditionerOn(500),
                gc.new ConditionerOff(600),
                gc.new WaterOn(600),
                gc.new WatterOff(800),
                gc.new ThermostatDay(1400)
        };
        gc.addEvent(ec.new TVOn(1600));
        gc.addEvent(ec.new TvOff(1700));
        gc.addEvent(gc.new Restart(2000,events));
        if (args.length!=1)
            gc.addEvent(new GreenHouseControls.Terminate
                    (1));

            gc.run();

    }
}
