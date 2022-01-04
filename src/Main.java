import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StreetsAtCities streetsAtCities =new StreetsAtCities();
        Address address= new Address("London","Bitter",streetsAtCities);
        User user= new User("cr7","Suiiiii","0527777801",true);
        Property property= new Property(address,4,6000,1,1,7,7,user.getUserName());
        RealEstate re1 = new RealEstate(user,property,address,null,null);
        //please Shai , do not pay attention to that, it was a test   :)
        Scanner scanner= new Scanner(System.in);
        int choose=scanner.nextInt();
        switch (choose){
            case 1:{
                re1.createUser();
                break;
            }
            case 2:{
                re1.login(4);
                break;
            }
            case 3:{
                break;
            }
        }
        System.out.println(re1);
    }
}
