package org.college;

public class Destination {
	public void collegeName() {
		System.out.println(" SRM Institute of Science and Technology ");
	}
	public void collegeCode() {
		System.out.println(" 1234 ");
	}
	public void collegeRank() {
		System.out.println(" 3rd Rank ");
	}
	public static void main(String[] args) {
		College c= new College ();
	      c.collegeName();
	      c.collegeCode();
	      c.collegeRank();
	Student s = new Student();
	s.studentName();
	s.studentDept();
	s.studentId();
	Hostel h = new Hostel();
	h.hostelName();
	Dept d = new Dept();
	d.deptName();}
	}
