import java.time.LocalDateTime;
import java.time.ZoneId;


class DateTime_21 {
    public static void main(String[] args) {
        for (String key : ZoneId.SHORT_IDS.keySet()) {
            ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get(key));
            System.out.println(zoneId + ": " + LocalDateTime.now(zoneId));
        }
    }
}
