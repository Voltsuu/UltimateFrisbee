public class Captain extends UltimatePlayer{
    public boolean type;

    public Captain(String firstName, String lastName, String position, int jerseyNumber, boolean type){
        super(firstName, lastName, position, jerseyNumber);
        this.type = type;
    }
    public boolean getType(){
        return type;
    }
    public int throwDisc(int pow){
        return 5*pow;
    }
    public String toString(){
        String s = "";
        s += super.toString() + "\n   Jersey #: " + getJerseyNumber() + "\n   Position: " + getPosition();
        if (getType()) {
            s += "\n   Captain: Offense";
        } else {
            s += "\n   Captain: Defense";
        }
        return s;
    }
}
