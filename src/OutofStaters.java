public class OutofStaters extends Person {

    private String oldState;
    private String oldCity;




// regular constructor
    public OutofStaters(String name, int age, String gender, String oldCity, String oldState){

        // super constructor, has to be in baby class to call constructors from person class
        super(name, age, gender);

        this.oldState = oldState;
        this.oldCity = oldCity;

    }

    public String getOldState(){
        return this.oldState;
    }

    public String getOldCity(){
        return this.oldCity;
    }
//method
    public String printImFrom() {

        return ("Originally from: " + this.getOldCity() + ", " + this.getOldState() + ".");
    }

}
