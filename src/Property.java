public class Property {
    private Address address;
    private int roomNum;
    private int price;
    private int propertyType;
    private int forRent;
    private int houseNum;
    private int floor;
    private String nameOfUser;
    public Property(Address address, int roomNum, int price, int propertyType, int forRent, int houseNum, int floor, String nameOfUser){
        this.address=address;
        this.roomNum=roomNum;
        this.price=price;
        this.propertyType=propertyType;
        this.forRent=forRent;
        this.houseNum=houseNum;
        this.floor=floor;
        this.nameOfUser=nameOfUser;
    }
    public Address getAddress(){
        return this.address;
    }
    public void setAddress(Address address){
        this.address=address;
    }
    public int getRoomNum(){
        return this.roomNum;
    }
    public void setRoomNum(int roomNum){
        this.roomNum=roomNum;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPropertyType(){
        switch (this.propertyType){
            case 1:{
                System.out.println("apartment");
            }
            case 2:{
                System.out.println("private house");
            }
        }
        return this.propertyType;
    }
    public void setPropertyType(int propertyType){
        this.propertyType=propertyType;
    }
    public void setForRent(int forRent){
        this.forRent=forRent;
    }
    public int getHouseNum(){
        return this.houseNum;
    }
    public void setHouseNum(int houseNum){
        this.houseNum=houseNum;
    }
    public int getFloor(){
        return this.floor;
    }
    public void setFloor(int floor){
        this.floor=floor;
    }
    public String getNameOfUser(){
        return this.nameOfUser;
    }
    public void setNameOfUser(User nameOfUser){
        this.nameOfUser=nameOfUser.getUserName();
    }

    public int getForRent() {
        switch (this.forRent){
            case 1:{
                System.out.println("for sale");
            }
            case 2:{
                System.out.println("for rent");
            }
        }
        return this.forRent;
    }

    @Override
    public String toString() {
        return "Property{" +
                "address=" + address +
                ", roomNum=" + roomNum +
                ", price=" + price + '$' +
                ", propertyType=" + getPropertyType() +
                ", forRent=" + getForRent() +
                ", houseNum=" + houseNum +
                ", floor=" + floor +
                ", nameOfUser=" + nameOfUser +
                '}';
    }
}
