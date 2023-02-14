import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ProductGenerator {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);


        String addAnother = "y";

        String FileName = UserInput.nextLine();

        try (FileWriter Writer = new FileWriter(FileName + ".txt", true)) {
            while (addAnother.equalsIgnoreCase("y")) {

                String Name;
                String ID;
                String Description;
                Double Cost;


                ID = SafeInput.getRegExString(UserInput, "Enter Your ID Number: ", "00000\\d");
                Name = SafeInput.getNonZeroLenString(UserInput, "Enter Your Name: ");
                Description = SafeInput.getNonZeroLenString(UserInput, " Enter Your Description");
                Cost = SafeInput.getDouble(UserInput, "Enter Your Price");


                String data = ID + "," + Name + " " + Description + "," + Cost;

                System.out.println("Do You Want To Add Another Person(Y/N):");
                addAnother = UserInput.nextLine();

            }


        } catch (IOException e) {
            System.out.println("Error Writing To File" + e);
        }

    }
}
