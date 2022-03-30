public class Student {

    private String lastName;
    private String firstName;
    private int tardies;

    public Student(String lastName, String firstName, int tardies) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.tardies = tardies;
    }

    public String getLastName(){return lastName;}

    public String getFirstName() {return firstName;}

    public int getTardies() {return tardies;}

    public void setLastName(String l) {lastName = l;}

    public void setFirstName(String f) {firstName = f;}

    public void setTardies(int t) {tardies = t;}

    public String toString(){
        String str;
        str = "First Name = " + firstName + "\n" + "Last Name = " + lastName + "\n" + "Tardies = " + tardies + "\n";
        return str;
    }

}
