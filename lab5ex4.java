import java.util.*;

class Employee
{
String first_name;
String last_name;

Employee(String f_name,String l_name)
{
this.first_name=f_name;
this.last_name=l_name;
}

public String getF_Name()
{
return first_name;
}

public String getL_Name()
{
return last_name;
}
}

class F_Name_L_Name extends RuntimeException
{
	F_Name_L_Name(String msg)
	{
	super(msg);
	}
}

class EmployeeMain
{
public static void main(String arg[])
{
	//Employee e[]=new Employee[2];
	List<Employee> l=new LinkedList<>();	
	Employee e1=new Employee("Kislaya","Roy");
	Employee e2=new Employee(" "," ");
	l.add(e1);
	l.add(e2);
	EmployeeMain ob=new EmployeeMain();
	ob.display(l); 


}

public void display(List<Employee> e)
{
	for(int i=0;i<e.size();i++)
	{
	Employee employees=e.get(i);
	if((employees.getF_Name()==" ")&&(employees.getL_Name()==" "))
	{
	throw new F_Name_L_Name("First name and last name is mendatory");
	}
	System.out.println("First name= "+employees.getF_Name()+" Last name= "+employees.getL_Name());
	}	
}
}

