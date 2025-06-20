/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class tables {
    public static void main(String[] args) {
        try{
            String userTable = "create table user(id int AUTO_INCREMENT PRIMARY KEY, name varchar(200), email varchar(200), mobileNumber varchar(10), address varchar(200), password varchar(200), securityQuestion varchar(200), answer varchar(200), status varchar(20), UNIQUE (email))";
            String adminDetails = "INSERT INTO user(name, email, mobileNumber, address, password, securityQuestion, answer, status) " +
                      "VALUES ('Admin', 'long1792003@gmail.com', '0826885450', 'VN', 'admin', 'admin?', 'admin', 'true')";
            String categoryTable = "create table category( id int AUTO_INCREMENT primary key, name varchar(200))";
            String productTable="create table product( id int AUTO_INCREMENT primary key, name varchar(200), category(200), price varchar(200))";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            DbOperations.setDataOrDelete(adminDetails, "Admin Details Added Successfully");
            DbOperations.setDataOrDelete(categoryTable, "Category Table Created Successfully");
            DbOperations.setDataOrDelete(productTable, "Product Table Created Successfully");


            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
