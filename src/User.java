import java.util.Arrays;

public class User {
    private String userName;
    private String password;
    private String phoneNum;
    private boolean broker;
    private Property[] properties;

    public User(String userName, String password, String phoneNum, boolean broker){
        this.userName=userName;
        this.password=password;
        this.phoneNum=phoneNum;
        this.broker=broker;
        this.properties=new Property[0];
    }
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPhoneNum(){
        return this.phoneNum;
    }
    public void setPhoneNum(String phoneNum){
        this.phoneNum=phoneNum;
    }
    public boolean isBroker(){
        return this.broker;
    }

    public void setBroker(boolean broker) {
        this.broker = broker;
    }

    public Property[] getProperties() {
        return properties;
    }

    public void setProperties(Property[] properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", broker=" + broker +
                ", properties=" + Arrays.toString(properties) +
                '}';
    }
}
