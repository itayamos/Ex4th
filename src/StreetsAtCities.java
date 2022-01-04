import java.util.Arrays;

public class StreetsAtCities {
    private final String[] Luton;
    private final String[] London;
    private final String[] Plymouth;
    private final String[] Leeds;
    private final String[] streets;
    public StreetsAtCities(){
        this.streets=new  String[]{"Bitter", "Lennon", "Elizabeth", "Albion", "Baker", "Moston", "Downing"};
        this.Luton=new String[]{getStreets()[0], getStreets()[2],
                getStreets()[6]};
        this.London=new String[]{getStreets()[0], getStreets()[1],
                getStreets()[2], getStreets()[4],
                getStreets()[5]};
        this.Plymouth=new String[]{getStreets()[1], getStreets()[3],
                getStreets()[5], getStreets()[2]};
        this.Leeds=new String[]{getStreets()[0], getStreets()[6]};
    }
    public String[] getLuton(){
        return this.Luton;
    }
    public String[] getLondon(){
        return this.London;
    }
    public String[] getPlymouth(){
        return this.Plymouth;
    }
    public String[] getLeeds(){
        return this.Leeds;
    }
    public String[] getStreets(){
        return this.streets;
    }

    @Override
    public String toString() {
        return "StreetsAtCities{" +
                "Luton=" + Arrays.toString(Luton) +
                ", London=" + Arrays.toString(London) +
                ", Plymouth=" + Arrays.toString(Plymouth) +
                ", Leeds=" + Arrays.toString(Leeds) +
                ", streets=" + Arrays.toString(streets) +
                '}';
    }
}
