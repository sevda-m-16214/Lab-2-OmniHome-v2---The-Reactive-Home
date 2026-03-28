package strategy;

public class LoudSirenStrategy implements AlertStrategy{
    @Override
    public void executeAlert() {
        System.out.println("SOUNDING 120db SIREN!");
    }
}
