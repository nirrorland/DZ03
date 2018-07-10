package poker.model;

public class Values {
    private static String[] values;

    static {
        values = new String[13];
       // values[0]="Joker";

        for (int i = 0; i <10; i++) {
            values[i] = Integer.toString(i+1);

        }

        values[10]="Jack";
        values[11]="Queen";
        values[12]="King";
    }

    public static String[] getValues() {
        return values;
    }
}
