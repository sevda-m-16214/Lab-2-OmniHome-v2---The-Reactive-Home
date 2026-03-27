package strategy;

public class LoudSirenStrategy implements AllertStrategy{
    @Override
    public void executeAlert() {
        System.out.println("SOUNDING 120db SIREN!");
    }
}
