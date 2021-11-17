package adapter;
import twitter.TwitterUser;
import user.User;

import java.util.Date;

public class TwitterAdapter implements User {
    private TwitterUser twitterUser;
    public TwitterAdapter (TwitterUser user){
        this.twitterUser = user;
    }

    public String getEmail() {
        return twitterUser.getUserMail();
    }

    public String getCountry() {
        return twitterUser.getCountry();
    }

    public Date getTime() {
        return twitterUser.getLastActiveTime();
    }
}
