import java.util.EnumSet;

public class EnumSetExample {
	enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
    	EnumSet<Days> weekend = EnumSet.of(Days.SATURDAY, Days.SUNDAY);

    	System.out.println("Weekend: " + weekend);

        // Add or iterate
        for (Days day : weekend) {
        	System.out.println(day);
        }
    }
}
