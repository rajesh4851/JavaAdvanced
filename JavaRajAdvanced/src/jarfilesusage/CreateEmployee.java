package jarfilesusage;

import pojo.Address;
import pojo.Employee;

public class CreateEmployee {
/* rajes created on 7/13/2019 
inside the package - jarfilesusage */
public static void main(String[] args) {
    Employee employee = new Employee(10, "John", "HR");
//    pojo.Address address = "301 E Market Street, Indianapolis, IN 46200";
//    Address address = new Address();

//    address.address1 = "301 East Market Street";
//    address.country = "USA";
//    address.zip = "46220";
//
//    employee.setAddress(address);

    employee.setName("Rajesh");


    System.out.println(employee.getName() );

}


}
