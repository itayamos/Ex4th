public class Address {
    private String city;
    private String street;
    private StreetsAtCities streetAtCity;
     public Address(String city, String street, StreetsAtCities streetAtCity){
         this.city=city;
         this.street=street;
         this.streetAtCity=streetAtCity;
     }
     void CityExists(){
         if (this.city.equals("Luton")){
             for (int a=0; a<streetAtCity.getLuton().length; a++){
                 if (this.street==streetAtCity.getLuton()[a]){
                     break;
                 }
             }
         }
         else if (this.city.equals("London")){
             for (int b=0; b<streetAtCity.getLondon().length; b++){
                 if (this.street==streetAtCity.getLondon()[b]){
                     break;
                 }
             }
         }
         else if (this.city.equals("Plymouth")){
             for (int c=0; c<streetAtCity.getPlymouth().length; c++){
                 if (this.street==streetAtCity.getPlymouth()[c]){
                     break;
                 }
             }
         }
         else if (this.city.equals("Leeds")){
             for (int d=0; d<streetAtCity.getLeeds().length; d++){
                 if (this.street==streetAtCity.getLeeds()[d]){
                     break;
                 }
             }
         }

     }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public StreetsAtCities getStreetAtCity() {
        return streetAtCity;
    }

    public void setStreetAtCity(StreetsAtCities streetAtCity) {
        this.streetAtCity = streetAtCity;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", streetAtCity=" + streetAtCity +
                '}';
    }
}
