package chapter10.sequence;


import java.util.Arrays;

interface Selector {
    boolean end();
    Object current();
    void next();
    boolean reverseSelector();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    private Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    public void addForInner(int j) {
        Sequence s = new Sequence(j);
        for (int i = 0; i < s.items.length; i++) {
            s.add(new ForInner(i + ":Vag"));
        }
        Selector sel = s.selector();
        while (!sel.end()) {
            System.out.println(sel.current() + " ");
            sel.next();
        }
    }

    public class ForInner {
        private String name;

        public ForInner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "ForInner{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


    private class SequencceSelector implements Selector {
        private int i;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) i++;
        }

        @Override
        public boolean reverseSelector() {
            i--;
            return i == 0;
        }

        public Sequence sequence(int j) {
            return new Sequence(j);
        }
    }

    private Selector selector() {
        return new SequencceSelector();
    }


    public static void main(String[] args) {
        Sequence sequence = new Sequence(5);

        for (int i = 0; i < sequence.items.length; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        sequence.addForInner(2);
        SequencceSelector seq = sequence.new SequencceSelector();
        Sequence s = seq.sequence(6);
        for (int i = 0; i < s.items.length; i++) {
            s.add(s.new ForInner(i + ":Vag"));
        }
        Selector sel = s.selector();
        while (!sel.end()) {
            System.out.println(sel.current() + " ");
            sel.next();
        }
        System.out.println();
        while (!sel.reverseSelector()) {
            System.out.println(sel.current());

        }
    }
}
