package org.system;

public class Student extends org.department.Department {
	public void studentName()
	{
		System.out.println("Priya");
	}
	public void studentDept()
	{
		System.out.println("cs");
	}
	public void studentId()
	{
		System.out.println("1245");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.deptName();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.studentDept();
		stu.studentId();
		stu.studentName();

	}

}


