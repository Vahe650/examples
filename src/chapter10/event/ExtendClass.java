package chapter10.event;

public class ExtendClass extends GreenHouseControls {

    class TVOn extends Event{

        public TVOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            onTv=true;

        }

        @Override
        public String toString() {
            return "TV is ON";
        }
    }
    class TvOff extends Event {
        public TvOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            onTv=false;
        }

        @Override
        public String toString() {
            return "Tv is oFf";
        }
    }
}
