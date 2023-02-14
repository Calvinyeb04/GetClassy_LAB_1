import java.util.*;
public class PersonGen {
    public static void main(String[] args) {
        ArrayList<Person> recs = new ArrayList<>();
        Scanner UserInput = new Scanner(System.in);
        Person p;
        boolean done = false;

        //Declear Varibles///
        String FirstName;
        String LastName;
        String ID;
        String Title;
        int YOB;


        //Do While Loop//
        do
        {
         ///ASK YOUR QUESTIONS///
            ID = SafeInput.getRegExString(UserInput, "Enter Your ID: ", "00000\\d");
            FirstName = SafeInput.getNonZeroLenString(UserInput, "Enter Your First Name: ");
            LastName = SafeInput.getNonZeroLenString(UserInput, "Enter Your Last Name: ");
            Title = SafeInput.getNonZeroLenString(UserInput, "Enter Your Title");
            YOB = SafeInput.getRangedInt(UserInput, "Enter Your BirthYearL", "1940", "2000");


            p = new Person(ID,FirstName,LastName,Title,YOB);
            recs.add(p);

            done = SafeInput.getYNConfirm(UserInput ,"Are You Sure");


        }while (!done);


    }
}
