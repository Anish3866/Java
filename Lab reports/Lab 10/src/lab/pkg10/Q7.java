import java.sql.*;

public class Q7 {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/company",
                    "root",
                    ""
            );

            Statement st = con.createStatement();

            // Create Table
            st.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS employee(" +
                    "eid INT PRIMARY KEY," +
                    "name VARCHAR(50)," +
                    "address VARCHAR(50)," +
                    "department VARCHAR(50))"
            );

            // Insert
            st.executeUpdate(
                    "INSERT INTO employee VALUES" +
                    "(1,'Ram','Kathmandu','IT')"
            );

            // Read
            ResultSet rs = st.executeQuery("SELECT * FROM employee");

            System.out.println("Employee Records:");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("eid") + " " +
                        rs.getString("name") + " " +
                        rs.getString("address") + " " +
                        rs.getString("department")
                );
            }

            // Update
            st.executeUpdate(
                    "UPDATE employee SET department='HR' WHERE eid=1"
            );

            // Delete
            st.executeUpdate(
                    "DELETE FROM employee WHERE eid=1"
            );

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}