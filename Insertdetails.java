package Project;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Insertdetails extends Createconnection
{
	PreparedStatement pstm;
	Connection con=	Createconnection.createConnection();
	public void insertDetails()  throws Exception
	{
		try
		{
			String query = " insert into employee (E_Id,First_Name, Last_Name, DOB, Gender, Email_Id, Phone_Number, Address, Salary, Resume)"
			        + " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			 
			// create the mysql insert preparedstatement
			
		      pstm = con.prepareStatement(query);
		      

		      pstm.setInt (1, 5);
		      pstm.setString (2, "Bharti");
		      pstm.setString (3, "Bauhara");
		      pstm.setDate(4, java.sql.Date.valueOf("2013-09-04"));
		      pstm.setString(5,"F");
		      pstm.setString(6, "bharti@gmail.com");
		      pstm.setString (7, "8765678976");
		      pstm.setString (8, "house no-50,new delhi");
		      pstm.setInt(9,60000); 
		      File file = new File("johndoe_resume.pdf");
	          FileInputStream input = new FileInputStream(file);
	 
	            // set parameters
	            pstm.setBinaryStream(10, input);

		      // execute the preparedstatement
		      pstm.execute();
		      
		      con.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	

}
