package Project;
public class Employeedetails {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hiii");
	
		
		Fetchdata fObj=new Fetchdata();
		fObj.readEmployeeDetails();
		
		Modifiydetails mObj=new Modifiydetails();
		mObj.modifications();
		
		Insertdetails iObj=new Insertdetails();
		iObj.insertDetails();
		
	}

}
