package test;

public class test1 {

	int managerId;
	int id;
	String name;
	
	
	
public test1(int managerId, int id, String name) {
		super();
		this.managerId = managerId;
		this.id = id;
		this.name = name;
	}


}


public static void main(String[] args) {
	
}




employee- id, code,deptid
department- id,name


select e.id,e.code,d.id,d.name from Employee e OUTER JOIN Department d ON e.deptId=d.id where e.deptId=d1 ;
