//6510450291 Chutipong Triyasith
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
    public void choose(String flavor);
}
