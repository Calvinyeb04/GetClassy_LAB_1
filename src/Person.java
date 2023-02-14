import java.util.Calendar;

public class Person {
    String FirstName;
    String LastName;
    String ID;
    String Title;
    int YOB;

    public Person(String s, String name, String firstName, String lastName, int YOB) {
        FirstName = firstName;
        LastName = lastName;
        this.ID = ID;
        Title = Title;
        this.YOB = YOB;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYOB() {
        return YOB;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", ID='" + ID + '\'' +
                ", Title='" + Title + '\'' +
                ", YOB='" + YOB + '\'' +
                '}';
    }
     ///Getting FullName///
    public String FullName() {
        return FirstName + " " + LastName;
    }
       ///Getting FormalName///
    public String FormalName() {
        return Title + " " +  FirstName + " " + LastName;
    }
    //Getting Age///
    public String GetAge() {
        Calendar now = Calendar.getInstance();
        int currentYear = now.get(Calendar.YEAR);
        int age = currentYear - YOB;
        return "Age: " + age;
    }

    public String GetAge(int year) {
        int age = year - YOB;
        return "Age in " + year + ": " + age;
    }

    ///CVSDATARECORD///
    public String toCSVDataRecord() {
        return ID + ", " + FirstName + ", " + LastName + ", " + Title + ", " + YOB;
    }
}
