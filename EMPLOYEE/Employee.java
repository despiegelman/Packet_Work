package EMPLOYEE;

public class Employee {
    private double salary;

    public Employee(double s){
        salary = s;
    }

    public void increase(double num){
        if (num > 0){
            salary += num;
        }
    }

    public double getPay(){
        return salary;
    }
}
