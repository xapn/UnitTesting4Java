package xapn.testing.tdd.car.v1;

public class Wheel {

    private int angle;

    /**
     * Constructeur par défaut
     */
    public Wheel() {
        setAngle(0);
    }

    /**
     * @return the angle
     */
    public int getAngle() {
        return angle;
    }

    /**
     * @param angle
     *            the angle to set
     */
    public void setAngle(int angle) {
        this.angle = angle % 360;
    }
}
