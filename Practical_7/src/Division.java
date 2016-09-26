/**
 * Created by Jake on 12/09/2016.
 */
public abstract class Division {
    String divisionName;
    int accountNum;

    public Division(String divisionName, int accountNum) {
        this.divisionName = divisionName;
        this.accountNum = accountNum;
    }

    public abstract void display();

    public String toString(){
        return "Division Name: " + divisionName + " Account Num: " + accountNum + " ";
    }
}
