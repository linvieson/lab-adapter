import authorization.Authorization;
import db.DataBase;
import report.ReportBuilder;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Authorization authorization = new Authorization();

        if (authorization.authorize(db)) {
            ReportBuilder reportBuilder = new ReportBuilder(db);
        }
    }
}