package chapter8.polimorf;

class Super {
    int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    int field = 1;

    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super supers=new Sub();//upcast
        System.out.println("super.field="+supers.field+", super.getfield="+supers.getField());
        Sub sub=new Sub();
        System.out.println("sub.field="+sub.field+", sub.getfield="+sub.getField()+", sub.getSuperField="+sub.getSuperField());
    }

}
