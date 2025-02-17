
import java.text.NumberFormat;

public class Employee {//parrent class
    public int countOfEmployees=0;
   protected  int empId;
   protected  String name;
   protected  String ssn;
    protected  double salary;

    //constructor
    public Employee (int empId, String name, String ssn, double salary){
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
        


    }
    public void setName(String n){
        name = n;
    }
    public void setId(int e){
        empId = e;
    }
    public void raiseSalary(double increase){
        salary += increase;
        //salary = salary + increase;
    }
    public double getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public int getEmpId(){
        return empId;
    }
    public String getSsn(){
        return ssn;
    }
    
    public String toString(){
        //behaviour of the parent class is overridden
       return "Employee ID: "+empId+"\n"+" Name: "+name+"\n"+" SSN: "+ssn+"\n"+" Salary: "+NumberFormat.getCurrencyInstance().format(salary);
    }
    
      
    
}
