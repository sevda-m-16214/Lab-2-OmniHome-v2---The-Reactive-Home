package strategy;

public class SilentPushStrategy implements AlertStrategy{
    @Override
    public void executeAlert(){
        System.out.println("Sending silent push notification to homeoner's phone.");
    }
}
