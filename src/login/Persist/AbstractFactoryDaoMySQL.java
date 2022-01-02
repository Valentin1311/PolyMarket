package Persist;

import java.sql.*;

public class AbstractFactoryDaoMySQL extends AbstractFactoryDao {

    Connection con;

    public UserDao createUserDao() {
        return new UserDaoMySQL(this);
    }

    public OrderDao createOrderDao() {
        return new OrderDaoMySql(this);
    }

    public CategoryDao createCategoryDao() {
        return new CategoryDaoMySQL(this);
    }

    public Connection getConnection() {
        try {
            if (con == null)
                con = DriverManager.getConnection("jdbc:mysql://eu01-db.cus.mc-panel.net/db_442584", "db_442584",
                        "9bfc0fd115");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
