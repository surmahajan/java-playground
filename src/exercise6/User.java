package exercise6;

import java.util.Objects;
import exercise6.PlayList;

public class User {

    private int userId;
    private String userName;
    private int planId;
    private PlayList playList;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    // TODO: Generate Getters and Setters

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    // override equals
    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(!(obj instanceof User)) {
            return false;
        }

        User user = (User)obj;
        if(this.userId != user.userId)
        {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.userId);
    }

}