package pl.pjatk.kmiklewicz;

public class User {
    private String accID;

    public User(String accID) {
        this.accID = accID;
    }

    public String getAccID() {
        return accID;
    }

    @Override
    public String toString() {
        return "User{" +
                "accID='" + accID + '\'' +
                '}';
    }
}
