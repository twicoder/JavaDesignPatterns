package headfirstdesignpatterns.ch6;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("NoCommand.execute()");
    }
}
