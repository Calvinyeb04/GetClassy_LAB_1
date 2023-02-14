public class Product {
    String Name;
    String Description;
    String ID;
    Double Cost;

    //Construstor//

    public Product(String name, String description, String ID, Double cost) {
        Name = name;
        Description = description;
        this.ID = ID;
        Cost = cost;
    }

    //Getter And Setter//

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Double getCost() {
        return Cost;
    }

    public void setCost(Double cost) {
        Cost = cost;
    }


    ///To String//

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", Description='" + Description + '\'' +
                ", ID='" + ID + '\'' +
                ", Cost=" + Cost +
                '}';
    }

    ///CVSDATARECORD//
    public String toCVSDataRecord()
    {
        return ID + "," + Name + ""+Description + "" + Cost;
    }
}







///Project: Product
//Files: Product.java ProductTest.java
//ProductReader.java ProductGenerater.java
//Fields:
//String name
//String description
//String ID // should never change
//double cost
//Do the same thing with Product as you did with Person. Create the JUnit tests, etc.