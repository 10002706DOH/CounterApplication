package counterapplication;

public class FancyCounter extends Counter {
    
    public void decrement() {
        value = value - 1;
    }
    
    @Override
    public void reset() {
        value = 17;
    }
}
