import java.sql.Date;

public class Employee{
     private String name;
     private int salary;
     private String jobTitle;

      public Employee(String name, int salary, String jobTitle){
            this.name = name;
            this.salary = salary;
            this.jobTitle = jobTitle;
      }

      public String getName(){
            return name;
      }

      public void setName(String name){
            this.name = name;
      }

      public String getJobTitle(){
            return jobTitle;
      }

      public void setJobTitle(String jobTitle){
            this.jobTitle = jobTitle;
      }

      public void setSalary(int salary){
            this.salary = salary;
      }

      public void raiseSalary(int percentage){
            salary = salary + salary*percentage/100;
      }

      public void printEmployeeDetails(){
            System.out.println("Name: "+name);
            System.out.println("Job Title: "+jobTitle);
            System.out.println("Salary: "+salary);
      }
}