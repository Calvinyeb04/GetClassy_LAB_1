import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PersonReader {
    public static ArrayList<Person> readPersonsFromFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                String firstName = fields[0];
                String lastName = fields[1];
                String ID = fields[2];
                String title = fields[3];
                int YOB = Integer.parseInt(fields[4]);
                Person person = new Person(firstName, lastName, ID, title, YOB);
                persons.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persons;
    }
}

