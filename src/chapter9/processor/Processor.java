package chapter9.processor;

public interface Processor {
    String name();

    Object process(Object input);
 }
