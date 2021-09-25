public class Nature {

    public static void main(String[] args) {

        Penguin pingou = new Penguin("Pingou");
        pingou.dive();
        pingou.swimDown(3);
        pingou.swimUp(1);
        pingou.swimDown(4);
        pingou.swimUp(5);
        pingou.swimUp(1);
        pingou.getOut();

        Eagle hawkeye = new Eagle("Hawkeye");
        // TODO : uncomment the following code in order to test it

        hawkeye.takeOff();
        hawkeye.flyUp(120);
        hawkeye.flyUp(30);
        hawkeye.glide();
        hawkeye.flyDown(140);
        hawkeye.land();
        hawkeye.flyDown(9);
        hawkeye.land();

    }
}
