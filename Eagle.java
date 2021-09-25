public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.println(this.getName() + "takes off in the sky");
        }
    }

    public void flyUp(int meters) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 325);
            System.out.println(this.getName() + "flies upward, altitude : " + this.altitude);
        }

    }

    public void flyDown(int meters) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - meters, 0);
            if (this.altitude < 0) {
                this.altitude = 0;
            }
            System.out.println(this.getName() + "flies downward, altitude : " + this.altitude);
        }
    }


    public void glide() {
        if (this.flying) {
            System.out.println("It glides into the air");
        }
    }

    public void land() {
        if (this.flying && this.altitude == 0) {
            System.out.println(this.getName() + " lands on the ground.");
        } else {
            System.out.println(this.getName() + " is too high, it can't lands.");
        }
    }
}

