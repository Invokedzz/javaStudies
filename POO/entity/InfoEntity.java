package POO.entity;

public class InfoEntity {

    public String Name;

    public double Age;

    public String FavChar;

    public InfoEntity (String Name, double Age, String FavChar) {

        this.Name = Name;

        this.Age = Age;

        this.FavChar = FavChar;

    }

    public static String returnInfo (String Name, double Age, String FavChar) {

        return Name + " " + Age + " " + FavChar;

    }

}
