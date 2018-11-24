package chapter9.waveform;

import chapter9.processor.Apply;
import chapter9.processor.Processor;

import java.beans.PropertyChangeListener;

public class WaveForm {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "WaveForm{" +
                "id=" + id +
                '}';
    }
}

class Filter {
    public String name(){
        return getClass().getSimpleName();
    }
    public WaveForm process(WaveForm input){
        return input;
    }

}
class LowPass extends Filter{
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff=cutoff;
    }
    public WaveForm process(WaveForm input){
        return input;
    }
}
class HighPass extends Filter{
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff=cutoff;
    }
    public WaveForm process(WaveForm input){
        return input;
    }
}
class BandPass extends Filter{
    double lowCutoff,highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }
    public WaveForm process(WaveForm input){
        return input;
    }
}
class FilterADapter implements Processor{
    Filter filter;

    public FilterADapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Object process(Object input) {
        return filter.process(((WaveForm) input));
    }
}
class FilterProcessor{
    public static void main(String[] args) {
        WaveForm waveForm=new WaveForm();
        Apply.process(new FilterADapter(new LowPass(1.0)),waveForm);
        Apply.process(new FilterADapter(new HighPass(2.0)),waveForm);
        Apply.process(new FilterADapter(new BandPass(3.0,4.0)),waveForm);

    }
}