package app.proces;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;

public class MakeConnection {
    private String data;

    public MakeConnection() throws SQLException {
        java.sql.Connection connection = DriverManager.getConnection
                ("jdbc:sqlite:C:\\Users\\service-user\\IdeaProjects\\sensors\\aranet.db");
        ResultSet resultSet = null;
        Statement statement = null;

        try {
            Class.forName("org.sqlite.JDBC");
            connection.setAutoCommit(false);
            System.out.println("Opened database successfully");
            statement = connection.createStatement();

            resultSet = statement.executeQuery("SELECT * FROM metrics");
            while (resultSet.next()) {
                System.out.println("Metric NAME:"
                        + resultSet.getString("metric_name"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
//                resultSet.close();
//                statement.close();
//                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}