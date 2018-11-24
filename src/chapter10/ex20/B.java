package chapter10.ex20;

import java.util.Arrays;

public class B {
    public B() {
    }

    private U[] us=new U[3];

    public U[] getUs() {
        return us;
    }
    private int size = 0;

    public B(U[] us) {
        this.us = us;
    }
    public void add(U u) {
        if (size == us.length) {
            extend();
        }
        us[size] = u;
        size++;
    }


    private void extend() {
        U[] tmp = new U[us.length + 2];
        for (int i = 0; i < us.length; i++) {
            tmp[i] = us[i];
        }
        us = tmp;
    }
    public U getByIndex(int index) {
        us[index].first();
        us[index].second();
        us[index].third();
        return us[index];
    }

    U currentU(int anint) {
        for (int j = 0; j < us.length; j++) {
            if (anint==j){
            if (us[anint] == null) {
                System.out.println("null");
            } else {
                System.out.print(j + ": ");
                us[anint].first();
                us[anint].second();
                us[anint].third();
                break;
            }

            }
        }
        return us[anint];

    }

    U nullU(int i) {
        us[i] = null;
        return us[i];
    }

  public   void iterateU(U[] us) {
        for (int j = 0; j < us.length; j++) {
            if (us[j] == null) {
                System.out.println(j + ": null");
                continue;
            }
            U u = us[j];
            System.out.print(j + ": ");
            u.first();
            u.second();
            u.third();

        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.add(new A().makeU());
        b.add(new A().makeU());
        b.add(new A().makeU());
        b.add(new A().makeU());
        b.add(new A().makeU());
        b.add(new A().makeU());
        b.add(new A().makeU());
        b.add(new A().makeU());
        b.iterateU(b.getUs());



    }
}
