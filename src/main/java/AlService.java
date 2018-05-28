import db.DBHelper;
import models.Al;

public class AlService {
    public static void main(String[] args) {
        Al al1 = new Al("Alan", 36, "JavaScript");
        Al al2 = new Al("Big Daddy Kane", 26, "Java");
        Al al3 = new Al("Ally McG", 31, "Java");

        DBHelper.save(al1);
        DBHelper.save(al2);
        DBHelper.save(al3);
    }
}
