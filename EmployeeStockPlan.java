public class EmployeeStockPlan {
    public int grantStock(Employee e){
if( e instanceof Manager){
    return 100;
}
return 0;
    }
    
}
