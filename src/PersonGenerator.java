import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class PersonGenerator {
    public static void main(String[] args) {
        //Declear Scanners//
        Scanner UserInput = new Scanner(System.in);

        //Asking User IF it wants to add another person///
        //PT 1//
        String addAnother = "y";

        ///Asking UserFile Name//
        String FileName = UserInput.nextLine();


        ///Try Catch Block//
        try (FileWriter Writer = new FileWriter(FileName + ".txt", true)) {
            while (addAnother.equalsIgnoreCase("y")) {

                ///Declear Your Varibles///
                String FirstName;
                String LastName;
                String Title;
                String ID;
                int YOB;


                ///Ask Your Questions using SafeInput///

                ID = SafeInput.getRegExString(UserInput, "Enter Your ID: ", "00000\\d");
                FirstName = SafeInput.getNonZeroLenString(UserInput, "Enter Your First Name: ");
                LastName = SafeInput.getNonZeroLenString(UserInput, "Enter Your Last Name: ");
                Title = SafeInput.getNonZeroLenString(UserInput, "Enter Your Title");
                YOB = SafeInput.getRangedInt(UserInput, "Enter Your BirthYearL", "1940", "2000");


                ///storing/printing the UserInputs//
                String data = ID + "," + FirstName + " " + LastName + "," + Title + "," + YOB;

                //Asking if the user Wants to Add AnotherPerson//
                System.out.println("Do You Want To Add Another Person(Y/N):");
                addAnother = UserInput.nextLine();
            }


        }catch (IOException e){
            System.out.println("Error Writing To File " + e);
        }


    }
}
