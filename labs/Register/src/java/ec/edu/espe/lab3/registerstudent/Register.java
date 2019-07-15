/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab3.registerstudent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristina
 */

public class Register {
    private String name;
    private String instructor;
    private String course;
    private String schedule;
    private float cost;
    private float balance;
public Register(){
    
}
  public static void main(String[] args){
 
    }
    private Conexion conexion = new Conexion();
    public Register(String name,String instructor, String course, String schedule, float cost, float balance) {
       this.name =name;
        this.instructor = instructor;
        this.course = course;
        this.schedule = schedule;
        this.cost = cost;
        this.balance = balance;
    }
  public void RegisterDataBase( String name,String instructor, String course, String schedule, float cost, float balance){
       Connection con = conexion.getConnection();
        Statement st;
        //Creamos las sentenia sql
        String sql = "INSERT INTO student(student,course,schedule,cost,advance,instructor) "
                + "VALUES ('" + name+ "','" +course+ "','" + schedule+ "','"+ 2+ "','" + 2 + "','" + instructor + "')";
        //Ejecutamos la sentencia SQL
        try {
            st = con.createStatement();
            st.executeUpdate(sql);
            //Cerramos las conexiones 
            st.close();
            con.close();
        }    catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error no se puse registrar la provincia");
        }
  }
  
  public String  ListRegisterData(){
   Connection con = conexion.getConnection();
        Statement st;
        ResultSet rs;
        String sql = "SELECT * FROM student";
        System.out.println("bbb");
        String list="";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
               list=list+("Student:" + rs.getString(1) + " course:" + rs.getString(2) + " schedule:" + rs.getString(3) + " cost:" + rs.getFloat(4) + "advance:" + rs.getFloat(5) + " Instructor:" + rs.getString(6)+"\n");

            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se puede acceder a los datos de Alumnos");
        }
        return list;
}

    /**
     * @return the instrictor
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the instrictor to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the instrictor
     */
    public String getInstructor() {
        return instructor;
    }

    /**
     * @param instrictor the instrictor to set
     */
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    /**
     * @return the course
     */
    public String getCourse() {
        return course;
    }

    /**
     * @param course the course to set
     */
    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * @return the schedule
     */
    public String getSchedule() {
        return schedule;
    }

    /**
     * @param schedule the schedule to set
     */
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the balance
     */
    public float getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(float balance) {
        this.balance = balance;
    }

}
