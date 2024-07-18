//6510450291 Chutipong Triyasith
public class chooseFavor implements State{
    GumballMachine gumballMachine;

    chooseFavor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You have to choose the flavor first");
        System.out.println("No gumball dispensed");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void choose(String flavor) {
        gumballMachine.setFlavor(flavor);
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("You have chosen the flavor " + flavor);
    }
}
