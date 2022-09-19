package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



class Employee{
    String id;
    String name;
    double salary;




    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}



public class STDemo {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("001", "Chandni", 10000));
        emp.add(new Employee("002", "Pooja", 100050));
        emp.add(new Employee("003", "Vasavi", 500050));
        emp.add(new Employee("004", "Priya",  5000.20));



       List<String> names = emp.stream().map(Employee::getName).collect(Collectors.toList());



       System.out.println(names);
    }
}

	
