package content.dateTime;

import java.time.ZoneId;

public class ZoneIdDisplay {

    public static void main (String[] args) {

        for (String idsAvailable: ZoneId.getAvailableZoneIds()) {

            System.out.println(idsAvailable);

        }

    }

}
