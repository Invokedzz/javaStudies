package POO.imc.entities;

import java.util.ArrayList;

import java.util.List;

public class StatsTwo {

    private final double weight;

    private final double height;

    static List < PatientTwo > patientTwoList = new ArrayList<>();

    public StatsTwo ( double weight, double height ) {

        this.weight = weight;

        this.height = height;

    }

    public double calculusImc ( double weight, double height ) {

        return weight / ( height * height );

    }

    public static void addPatient ( PatientTwo patientTwo ) {

        patientTwoList.add( patientTwo );

    }

    public static void removePatient ( PatientTwo patientTwo ) {

        patientTwoList.remove( patientTwo );

    }

    @Override
    public String toString () {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append( "Weight: " ).append( weight ).append( "kg " )
                .append("Height: ").append( height ).append("m ");

        if ( !patientTwoList.isEmpty() ) {

            stringBuilder.append( "Patients: " );

            for ( PatientTwo list: patientTwoList ) {

                stringBuilder.append( list.toString() );

            }

        }

        return stringBuilder.toString();

    }

}
