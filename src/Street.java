import java.util.Arrays;

public class Street {
    private final String[] streets;

    public Street(String[] streets){
        this.streets=new  String[]{"Bitter", "Lennon", "Elizabeth", "Albion", "Baker", "Moston", "Downing"};
    }
    public String[] getStreets(){
        return this.streets;
    }

    @Override
    public String toString() {
        return "Street{" +
                "streets=" + Arrays.toString(streets) +
                '}';
    }
}
