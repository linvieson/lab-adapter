package authorization;

import db.DataBase;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Authorization extends Авторизація{

    public boolean authorize(DataBase db){
        return авторизуватися(db);
    }
}