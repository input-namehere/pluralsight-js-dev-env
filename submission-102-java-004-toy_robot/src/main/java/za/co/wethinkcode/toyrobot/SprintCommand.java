package za.co.wethinkcode.toyrobot;

public class SprintCommand extends Command {
    @Override
    public boolean execute(Robot target) {
        int nrSteps = Integer.parseInt(getArgument());
        int testSteps = 0;

        for (int i = nrSteps; i > 0; i--) {
            testSteps += i;
        }
    }
    public SprintCommand(String argument) {
        super("sprint", argument);
    } 
}
