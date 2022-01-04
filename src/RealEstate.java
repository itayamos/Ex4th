import java.util.Arrays;
import java.util.Scanner;

public class RealEstate {
    private User user;
    private Property property;
    private Address address;
    private User[] users;
    private Property[] properties;

    public RealEstate(User user, Property property, Address address, User[] users, Property[] properties) {
        this.user = user;
        this.property=property;
        this.address = address;
        this.users = new User[1];
        this.properties = new Property[0];
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Property getProperty() {
        return this.property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User[] getUsers() {
        return this.users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
    void createUser(){
        for (int i=0; i<users.length; i++){
            if (!users[i].getUserName().equals(user.getUserName())){
                System.out.println("valid user name");
                if (user.getPassword().contains("$") || user.getPassword().contains("%") || user.getPassword().contains("_")){
                    for (int k=0; k<user.getPassword().length(); k++){
                        if (Character.isDigit(user.getPassword().charAt(k))){
                            System.out.println("strong password");
                            if (user.getPhoneNum().length()==10 && user.getPhoneNum().charAt(0)=='0' && user.getPhoneNum().charAt(1)=='5'){
                                System.out.println("valid phone number");
                                users= new User[users.length+1];
                                users[users.length-1]=user;
                                break;
                            }
                            else {
                                System.out.println("enter again phone number");
                            }
                        }
                        System.out.println("weak password add digits");
                    }
                }
                else {
                    System.out.println("weak password add one of those $%_ and a num");
                }
            }
            else {
                System.out.println("user already exists");
                break;
            }
        }
    }
    User login(int n){
        for (int i=0; i< users.length; i++){
            if (users[i].getUserName().equals(user.getUserName()) && users[i].getPassword().equals(user.getPassword())){
                System.out.println("great choose an option");
                if (n==1){
                    postNewProperty(user);
                }
                if (n==2){
                    removeProperty(user);
                }
                if (n==3){
                    printAllProperty(user);
                }
                if (n==4){
                    printUserProperties(user);
                }
                if (n==5){
                    search();
                }
                if (n==6){
                    System.out.println("return to menu");
                    break;
                }
                break;
            }
            break;
        }
        return user;

    }
    boolean postNewProperty(User user){
        boolean limit=false;
        if (user.isBroker()){
            while (user.getProperties().length<=10){
                limit=true;
                user.setProperties(new Property[user.getProperties().length+1]);
                user.getProperties()[user.getProperties().length-1]=property;
                for (int i=0; i< user.getProperties().length-1; i++){
                    if (user.getProperties()[i].getAddress().getCity().equals(user.getProperties()[i + 1].getAddress().getCity())){
                        System.out.println(user.getProperties()[i+1].getAddress().getCity());
                    }
                    else {
                        System.out.println(user.getProperties()[i].getAddress().getCity());
                    }
                }

            }
            if (user.getProperties().length>10){
                limit=false;
            }
        }
        else {
            while (user.getProperties().length<=3){
                limit=true;
                user.setProperties(new Property[user.getProperties().length+1]);
                properties[user.getProperties().length-1]=property;
                //כפל קוד סוויצ' וקייס!
            }
            if (user.getProperties().length>3){
                limit=false;
            }
        }
        return limit;
    }
    void removeProperty(User user){
        Scanner scanner= new Scanner(System.in);
        int k= scanner.nextInt();
        if (user.getProperties().length==0){
            System.out.println("post some properties");
        }
        else {
            for (int i=k;i< user.getProperties().length; i++){
                user.getProperties()[i]=user.getProperties()[i-1];
                user.setProperties( new Property[user.getProperties().length-1]);
            }
        }
    }
    void printAllProperty(User user){
        for (int k=0; k< users.length; k++) {
            if (getUsers()[k].getProperties().length == 0) {
                System.out.println("post property at first");
            } else {
                for (int i = 0; i < getUsers()[k].getProperties().length; i++) {
                    System.out.println((k+1) + ". "+ (i + 1) + ". " + getUsers()[k].getProperties()[i] + "\n");
                }
            }
        }
    }
    void printUserProperties(User user){
        for (int i=0; i<user.getProperties().length; i++){
            System.out.println((i+1) +". "+ user.getProperties()[i]);
        }
    }

    Property[] search() {
        for (int i = 0; i < properties.length; i++) {
            if (getProperty().getPropertyType() == -999) {
                System.out.println("all property types" + properties[i]);
            } else {
                switch (getProperty().getPropertyType()) {
                    case 1: {
                        System.out.println(properties[i]);
                    }

                    case 2: {
                        System.out.println(properties[i]);
                    }
                }
            }
            if (getProperty().getPrice() == -999) {
                System.out.println("all price ranges" + getProperties()[i]);
            } else {
                int min = 0;
                int max = 0;
                max = Math.max(getProperties()[i].getPrice(), getProperties()[i + 1].getPrice());
                min = Math.min(getProperties()[i].getPrice(), getProperties()[i + 1].getPrice());
                System.out.println("price range: " + min + " - " + max);
            }
            if (getProperty().getRoomNum() == -999){
                System.out.println("show all room apartments" + getProperties()[i]);
            }
            else {
                switch (getProperties()[i].getRoomNum()) {
                    case 1: {
                        System.out.println(getProperties()[i]);
                    }
                    case 2: {
                        System.out.println(getProperties()[i]);
                    }
                    case 3: {
                        System.out.println(getProperties()[i]);
                    }
                    case 4: {
                        System.out.println(getProperties()[i]);
                    }
                    case 5: {
                        System.out.println(getProperties()[i]);
                    }
                    case 6: {
                        System.out.println(getProperties()[i]);
                    }
                }
            }
            if (getProperty().getForRent()==-999){
                System.out.println("show all houses for rent or sale" + getProperties()[i]);
            }
            else {
                switch (getProperties()[i].getForRent()){
                    case 1:{
                        System.out.println(getProperties()[i]);
                    }
                    case 2:{
                        System.out.println(getProperties()[i]);
                    }
                }
            }

        }

     return getProperties();
    }

    public Property[] getProperties() {
        return this.properties;
    }

    public void setProperties(Property[] properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "RealEstate{" +
                "user=" + user +
                ", property=" + property +
                ", address=" + address +
                ", users=" + Arrays.toString(users) +
                ", properties=" + Arrays.toString(properties) + '}';
    }
}
