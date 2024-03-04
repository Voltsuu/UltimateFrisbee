public class UltimatePlayer extends Person{
    public int jerseyNumber;
    public static int jerseyNumberCounter;
    public String position;

    public UltimatePlayer(String firstName, String lastName, String position, int jerseyNumber){
        super(lastName, firstName);
        if (position.equalsIgnoreCase("Handler")) {
            this.position = position;
        } else {
            this.position = "Cutter";
        }
        this.jerseyNumber = jerseyNumber;
    }
    public String getPosition(){
        return position;
    }
    public int getJerseyNumber(){
        return jerseyNumber;
    }
    public int throwDisc(int pow){
        return 4*pow;
    }
    public String toString(){
        String s = "";
        s += super.toString() + "\n   Jersey #: " + getJerseyNumber() + "\n   Position: " + getPosition();
        return s;
    }
}
