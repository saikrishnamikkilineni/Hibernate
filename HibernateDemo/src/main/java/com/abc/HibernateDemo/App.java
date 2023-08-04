package com.abc.HibernateDemo;

import java.util.List;

import com.abc.HibernateDemo.dao.DaoImpl;
import com.abc.HibernateDemo.dao.DaoInterface;
import com.abc.HibernateDemo.model.Employee;

public class App 
{
	
	
	
	
    public static void main( String[] args )
    {
    	
         App obj=new App();
         DaoInterface dao=new DaoImpl();
 		
         
         //Add employee details 
      /*  Employee e=new Employee();
		e.setId(101);
		e.setEname("kanna....");
		e.setCity("Hyd");
		e.setEmail("kanna@gmail.com"); 
		e.setSalary(500000); 
        
		dao.addEmployee(e);  */

	  //delete employee details 
      // dao.deleteEmp(101); 
         
         
         //get employee details by id
   /*     Employee e1=dao.getEmployeeById(102);
        System.out.println("EID: "+e1.getId());
        System.out.println("EName: "+e1.getEname()); 
        System.out.println("Ecity :"+e1.getCity());
        System.out.println("Email :"+e1.getEmail());
        System.out.println("Salary :"+e1.getCity()); */

         List<Employee> emplist=dao.viewAllEmp();
           
           for(Employee emp:emplist) {
        	   System.out.println("EID: "+emp.getId());
               System.out.println("EName: "+emp.getEname()); 
               System.out.println("Ecity :"+emp.getCity());
               System.out.println("Email :"+emp.getEmail());
               System.out.println("Salary :"+emp.getSalary());
           } 
    }

}