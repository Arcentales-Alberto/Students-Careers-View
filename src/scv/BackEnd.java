package scv;

import java.sql.ResultSet;

class BackEnd
{        
    public ResultSet getStudents(String careerName)
    {
        StudentsDAO cDAO = new StudentsDAO();
        return cDAO.loadStudents(careerName);
    }
    
}
