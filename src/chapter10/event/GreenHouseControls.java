package chapter10.event;

public class GreenHouseControls extends Controller {
    private boolean light = false;
    protected boolean onTv=false;

    public class LightOn extends Event {

        protected LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Lightis On";
        }
    }

    public class LightOff extends Event {

        protected LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;

        }

        @Override
        public String toString() {
            return "Light is Off{}";
        }
    }

    private boolean water = false;

    public class WaterOn extends Event {

        protected WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Water is On{}";
        }
    }

    public class WatterOff extends Event {

        protected WatterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;

        }

        @Override
        public String toString() {
            return "Watter is Off{}";
        }
    }

    private String thermostat = "day";

    public class ThermostatNight extends Event {

        protected ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "night";
        }

        @Override
        public String toString() {
            return "Thermostat use Night mode";
        }
    }
    public class ThermostatDay extends Event{

        protected ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat="day";

        }

        @Override
        public String toString() {
            return "Thermostat use Day mode";
        }
    }
    class Bell extends Event{

        protected Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Ring";
        }
    }
    public class Restart extends Event{
        private Event[] events;

        protected Restart(long delayTime,Event[] events) {
            super(delayTime);
            this.events=events;
            for (Event event : events)
                addEvent(event);

        }

        @Override
        public void action() {
            for (Event event : events) {
                event.start();//perezapusk kajdogo sobitiya
                addEvent(event);
            }
            start();//perezapusk tekushego sobitiya
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restarting...";
        }

    }

    public static class Terminate extends Event{

        protected Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);
        }

        @Override
        public String toString() { return "OFF"; }
    }
    private boolean conditioner=false;
    public class ConditionerOn extends Event{

        public ConditionerOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            conditioner=true;
            
        }

        @Override
        public String toString() {
            return "Conditioner is on";
        }
    }
    class ConditionerOff extends Event {
        public ConditionerOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            conditioner=false;
        }

        @Override
        public String toString() {
            return "Conditioneris  Off";
        }
    }


}
