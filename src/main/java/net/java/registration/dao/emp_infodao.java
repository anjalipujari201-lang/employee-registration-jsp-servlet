package net.java.registration.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.*;
import java.sql.SQLException;
import net.java.registration.model.emp_info;

public class emp_infodao {
    public int registerEmployee(emp_info employee) {
    	 int result = 0;
        String INSERT_USERS_SQL =
                "INSERT INTO employee " +
                "(first_name, last_name, username, password, address, contact) " +
                "VALUES (?, ?, ?, ?, ?, ?)";
        try {

           Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/emp_info?useSSL=false",
                    "root",
                    "root");

            PreparedStatement preparedStatement =
                    connection.prepareStatement(INSERT_USERS_SQL);

            preparedStatement.setString(1, employee.getFirstname());
            preparedStatement.setString(2, employee.getLastname());
            preparedStatement.setString(3, employee.getUsername());
            preparedStatement.setString(4, employee.getPassword());
            preparedStatement.setString(5, employee.getAddress());
            preparedStatement.setString(6, employee.getContact());
//            System.out.println(preparedStatement);
            result = preparedStatement.executeUpdate();
            System.out.println("Rows inserted:" +result);
            
            connection.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}