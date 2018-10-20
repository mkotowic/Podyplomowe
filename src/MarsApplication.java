public class MarsApplication {
    public static void main(String[] args) {
        Marsrobot spirit = new Marsrobot();

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttribiutes();

        System.out.println("Zwiększamy prędkość do 3.");

        spirit.speed = 3;
        spirit.showAttribiutes();

        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttribiutes();

        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttribiutes();

        Marsrobot opportunity = new Marsrobot();

        opportunity.status = "eksploracja";
        opportunity.speed = 2;
        opportunity.temperature = -60;

        opportunity.showAttribiutes();

        System.out.println("Zwiększamy prędkość do 3.");

        opportunity.speed = 3;
        opportunity.showAttribiutes();

        System.out.println("Zmiana temperatury na -90.");
        opportunity.temperature = -90;
        opportunity.showAttribiutes();

        System.out.println("Sprawdzenie temperatury.");
        opportunity.checkTemperature();
        opportunity.showAttribiutes();


    }
}
