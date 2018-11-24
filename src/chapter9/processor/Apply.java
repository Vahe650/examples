package chapter9.processor;

import java.util.Arrays;

class Upcase implements Processor {
        @Override
        public String name() {
            return getClass().getSimpleName();
        }

        @Override
        public Object process(Object input) {
            return ((String) input).toUpperCase();
        }
    }

    class Downcase implements Processor {
        @Override
        public String name() {
            return getClass().getSimpleName();
        }

        @Override
       public Object process(Object input) {
            return ((String) input).toLowerCase();
        }
    }

    class Splitter implements Processor {
        @Override
        public String name() {
            return getClass().getSimpleName();
        }

        @Override
       public Object process(Object input) {
            return Arrays.toString(((String) input).split("1 "));
        }
    }



        public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("ispolzuem Processor  "+p.name());
        System.out.println(p.process(s));
    }
    public  static String s="Disagriment with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}