package adapter;
import facebook.FacebookUser;
import user.User;

import java.util.Date;

public class FacebookAdapter implements User {
    private FacebookUser facebookUser;
    public FacebookAdapter (FacebookUser user){
        this.facebookUser = user;
    }

    public String getEmail() {
        return facebookUser.getEmail();
    }

    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    public Date getTime() {
        return facebookUser.getUserActiveTime();
    }
}
