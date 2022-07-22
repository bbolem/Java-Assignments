package com.btb.Day3;
class Employee{
    String role;
    Employee(String role){
        this.role = role;
    }
    public String workingStatus(){
        return "working...";
    }
}

class Intern extends Employee{
    Intern(){
        super("Intern");
    }
    public String workingStatus(){
        String status = "from home";
        return super.workingStatus() + "" + status;
    }
}

public class Super_7 {
    public static void main(String[] args) {
        Intern intern = new Intern();
        System.out.println(intern.role + " " + intern.workingStatus());
    }
}
