//6510450291 Chutipong Triyasith
public class SoldSate implements State {
    GumballMachine gumballMachine;
    public SoldSate(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turing twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
            gumballMachine.setFlavor("default");
        }
        else{
            System.out.println("Oops, out of gumball!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void choose(String flavor) {
        System.out.println("Can't choose a new flavor now.");
    }
}
