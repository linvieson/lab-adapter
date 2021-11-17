package db;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DataBase extends БазаДаних{

    public String getUserData() {
        return отриматиДаніКористувача();
    }

    public String getStatisticData() {
        return отриматиСтатистичніДані();
    }
}