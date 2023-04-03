package za.co.wethinkcode.toyrobot;

public class RightCommand extends Command {
    @Override
    public boolean execute(Robot target) {target.updatePosition(true);
            target.setStatus("Right");
        
        return true;
    }

    public RightCommand(String argument) {
        super("right", argument);
    }   
}
