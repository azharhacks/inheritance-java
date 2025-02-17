import java.text.NumberFormat;

public class Manager extends Employee  {
    private String deptName;
//creating another constructor since onstructors are not inherited 
public Manager (int empId, String name, String ssn, double salary,String deptName){
super(empId, name, ssn, salary);
this.deptName=deptName;
}

public void setDeptName(String d){
deptName=d;
}
public String toString(){
    //behaviour of the parent class is overridden
   return "Employee ID: "+empId+"\n"+" Name: "+name+"\n"+" SSN: "+ssn+"\n"+" Salary: "+NumberFormat.getCurrencyInstance().format(salary);
}
}
