package za.co.wethinkcode.toyrobot;

public class LeftCommand extends Command {
    @Override
    public boolean execute(Robot target) {
        target.updatePosition(true);
        target.setStatus("Turned left.");
        
        return true;
    }

    public LeftCommand(String argument) {
        super("left", argument);
    }
}

