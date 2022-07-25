package com.btb.Day5;

import lombok.*;

public class UserDefExceptionEx {
    public static void main(String[] args) throws UserNotFoundException {
        EmployeeService es = new EmployeeService();
        es.getEmpDetails(101);
        es = null;  //Unreachable
        es = new EmployeeService(); //Unreachable
        System.gc();    //request to call Garbage Collector
        Runtime.getRuntime().gc();  //another way to request to call Garbage collector



    }
}

class EmployeeService{
    Employee e1 = new Employee(101, "emp1");
    Employee e2 = new Employee(102, "emp2");


    Employee empArr[] = {e1, e2};

    public void getEmpDetails(int empId){
        if (empId == 101){
            System.out.println(empArr[0]);
        }
        else {
            throw new UserNotFoundException("User not found for the given value");
        }
    }
}

class UserNotFoundException extends RuntimeException{
    UserNotFoundException(String message){
        super(message);
    }
}

@Setter
@Getter
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Builder
@EqualsAndHashCode
class Employee{
    private int empId;
    private String name;
}