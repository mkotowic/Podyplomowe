public class Marsrobot implements Robot {
    String status;
    int speed;
    float temperature;

    public void checkTemperature() {
        if (temperature < -80){
            status = "powrót do domu";
            speed = 5;

        }
    }

    public void showAttribiutes(){
        System.out.println("Status: " + status);
        System.out.println("Prędkość: " + speed);
        System.out.println("Temperatura: " + temperature);
    }
    public void checkstatus() {

    }
}
