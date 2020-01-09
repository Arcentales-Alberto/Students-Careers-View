package scv;

// connection to mysql.

import java.sql.*;

class StudentsDAO
{
    public ResultSet loadStudents(String careerName)
    {
      ConnectionMySQL cn = new ConnectionMySQL();
      PreparedStatement ps;
      ResultSet rs = null;
      String SQL =   
      "SELECT students.id, students.student_name,students.lastname\n" +
      "FROM university.students INNER JOIN university.careers ON students.id_career = careers.id\n"+
      "WHERE careers.career_name = ?"; 
       
      try
      {
        ps = cn.connection.prepareStatement(SQL);
        ps.setString(1, careerName);
        rs = ps.executeQuery();
          
      }catch(SQLException e)
       {
         System.out.println(e);
       }
       
      return  rs;
    }

} // Class end.
