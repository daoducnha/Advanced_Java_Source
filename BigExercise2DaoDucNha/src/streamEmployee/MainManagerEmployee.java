package streamEmployee;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Dao Duc Nha
 * @version 1.0
 * @since 19-9-2016 Class MainManagerEmployee to manager list employee
 */
public class MainManagerEmployee {

    public static void main(String[] args) {
        Employee e1 = new Employee("Nguyen Van A", 24, 8000000);
        Employee e2 = new Employee("Le Thi B", 24, 250000);
        Employee e3 = new Employee("Cao Van C", 24, 5000000);
        Employee e4 = new Employee("Nguyen Thi Anh Hong", 25, 5000000);
        Employee e5 = new Employee("Le Van Thang ", 26, 10000000);
        Employee e6 = new Employee("Nguyen Van Ty", 24, 2900000);
        Employee e7 = new Employee("Nguyen Huu Thang", 24, 8000000);
        Employee e8 = new Employee("Le Huu Hieu", 24, 6000000);
        Employee e9 = new Employee("Nguyen Anh Minh", 24, 15000000);
        Employee e10 = new Employee("Nguyen Thi Luom", 29, 2000000);
        Employee e11 = new Employee("Van Viet Anh", 24, 6500000);
        Employee e12 = new Employee("Nguyen Xuan Thanh", 25, 8500000);
        Employee e13 = new Employee("Nguyen Thi Thuy", 30, 20000000);
        Employee e14 = new Employee("Hoang Van Viet", 22, 5000000);
        Employee e15 = new Employee("Nguyen Van Quyet", 30, 18000000);

        List<Employee> listeEmployees = new ArrayList<>();
        listeEmployees.add(e1);
        listeEmployees.add(e2);
        listeEmployees.add(e3);
        listeEmployees.add(e4);
        listeEmployees.add(e5);
        listeEmployees.add(e6);
        listeEmployees.add(e7);
        listeEmployees.add(e8);
        listeEmployees.add(e9);
        listeEmployees.add(e10);
        listeEmployees.add(e11);
        listeEmployees.add(e12);
        listeEmployees.add(e13);
        listeEmployees.add(e14);
        listeEmployees.add(e15);

        System.out.println("List Employee: ");
        printListEmployee(listeEmployees);
        System.out.println("=========><=========");
        System.out.println("Number Employee have salary greater 3000000 is: " + numberEmployeeSalary(listeEmployees));
        System.out.println("=========><=========");
        System.out.println("List Emplyee in name have string anh is: ");
        printListEmployeeAnh(listeEmployees);
        System.out.println("=========><=========");
        System.out.println("Statistics salary of list employee: ");
        System.out.println("Highest salary in list employee is: "+String.format("%.2f", employeeHighestSalary(listeEmployees)));
        System.out.println("Lowest salary in list employee is: "+String.format("%.2f", employeeLowestSalary(listeEmployees)));
        System.out.println("Average salary in list employee is: "+String.format("%.2f", calAverageSalary(listeEmployees)));
        System.out.println("Average age of employee in list is: " + String.format("%.2f", calAverageAgge(listeEmployees)));
    }

    //use Stream to print list employee 

    public static void printListEmployee(List<Employee> lst) {
        lst.stream().forEach((Employee e) -> System.out.println(e.toString()));
    }

    //count number employee have salary >3000000
    public static int numberEmployeeSalary(List<Employee> lst) {
        int count = (int) lst.stream().filter((Employee e) -> e.getSalary() > 3000000).count();
        return count;
    }

    //print list employee have String "anh" in name

    public static void printListEmployeeAnh(List<Employee> lst) {
        List<Employee> lstAnh = lst.stream().filter((Employee e) -> e.getName().contains("Anh")).collect(Collectors.toList());
        printListEmployee(lstAnh);
    }

    //statistics list employee about Highest salary , Lowest salary, Average salary;
    public static double employeeHighestSalary(List<Employee> lst) {
        DoubleSummaryStatistics statistics = lst.stream().mapToDouble((Employee x) -> x.getSalary()).summaryStatistics();
        double salary = statistics.getMax();
        return salary;
    }

    public static double employeeLowestSalary(List<Employee> lst) {
        DoubleSummaryStatistics statistics = lst.stream().mapToDouble((Employee x) -> x.getSalary()).summaryStatistics();
        double salary = statistics.getMin();
        return salary;
    }
    
    public static double calAverageSalary(List<Employee> lst) {
        DoubleSummaryStatistics statistics = lst.stream().mapToDouble((Employee x) -> x.getSalary()).summaryStatistics();
        double salary = statistics.getAverage();
        return salary;
    }
        
    
    public static double calAverageAgge(List<Employee> lst) {
        IntSummaryStatistics statistics = lst.stream().mapToInt((Employee x) -> x.getAge()).summaryStatistics();
        double avgAge = statistics.getAverage();
        return avgAge;
    }
}
