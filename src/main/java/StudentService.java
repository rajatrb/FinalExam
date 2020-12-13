import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentService implements StudentInterface{

    private String ob;

    public Connection getCon3() {
        return con3;
    }

    public void setCon3(Connection con3) {
        this.con3 = con3;
    }

    public Connection con3;

    public void DAOImplements(Connection con3) throws SQLException{
        this.con3 = con3;

    }


    @Override
    public Category edit(Category StudentData, String ccat) throws SQLException, ClassNotFoundException {
        return null;

        PreparedStatement query;
        query = con3.prepareStatement("Update category set catcode=?, catdesc=? where catcode = ?");
        query.setString(1, StudentData.getob());
        query.setString(2, StudentData.getoob());
        query.setString(3, ccat);
        query.executeUpdate();

        System.out.println("Record Edited");
        return StudentData;
    }

    @Override
    public void delete(String catcode) throws SQLException {

        String quer1 = "Delete from StudentData where catcode = ?";
        PreparedStatement query = con3.prepareStatement(quer1);
        query.setString(1, ob);
        query.executeUpdate();

        System.out.println("One record Deleted");
    }

    }

    @Override
    public void display(Object getCatsdesc) throws ClassNotFoundException, SQLException {


        String quer1 = "Select * from StudentData";
        PreparedStatement query = con3.prepareStatement(quer1);
        ResultSet rs = query.executeQuery();

        Category obj1;



        while (rs.next()) { //if record exists only then dispalying it

            obj1 = new StudentData(rs.getString("ob"),rs.getString("oob"));


            System.out.println();

            System.out.print("StudentName: " + ((StudentData) obj1).getob() + "  ");
            System.out.print("StudentNumber Description " + obj1.()).getoob();
            System.out.print("GPA " + obj1.()).getCatsdesc);


        }

    }

    private void getoob() {
    }

    @Override
    public void update() throws ClassNotFoundException, SQLException {

    }

    }
