package jarfilesusage;

import pojo.Address;
import pojo.Employee;

public class SetEmployeeAddress {
/* rajes created on 7/13/2019 
inside the package - jarfilesusage */
public static void main(String[] args) {
    Employee employee = new Employee(10, "John", "HR");

    Address address = new Address();

    address.address1 = "301 East Market Street";
    address.country = "USA";
    address.zip = "46220";
    System.out.println("updating the new address");

//    Address.setAddress("301 East Market Street,Indianapolis");
    employee.setAddress(address);

    System.out.println("here is the new address got updated");
    System.out.println(employee.getAddress() );
}
}
