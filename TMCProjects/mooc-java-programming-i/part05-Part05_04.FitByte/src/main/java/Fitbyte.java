public class Fitbyte {
    private int age;
    private int resting_heart_rate;
    
    public Fitbyte(int age, int resting_heart_rate)
    {
        this.age = age;
        this.resting_heart_rate = resting_heart_rate;
    }

    public double targetHeartRate(double percentageOfMaximum){
        return ((
                (this.getMaximumHeartRate()-resting_heart_rate)
                        *
                        percentageOfMaximum)
                + resting_heart_rate);
    }

    public double getMaximumHeartRate(){
        return (206.3 - (0.711 * age));
    }

}
