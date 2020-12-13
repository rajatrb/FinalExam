import jdk.jfr.Category;

import java.sql.SQLException;

public interface StudentInterface {

    public Category edit(Category ob, String oob) throws SQLException, ClassNotFoundException;
    public void delete(String ob) throws SQLException;
    public void display(Object getoob) throws ClassNotFoundException, SQLException;
    public void update() throws ClassNotFoundException, SQLException;
}
