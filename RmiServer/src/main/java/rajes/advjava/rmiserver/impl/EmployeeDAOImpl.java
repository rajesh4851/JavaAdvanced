package rajes.advjava.rmiserver.impl;

import rajes.advjava.rmiserver.IEmployeeDAO;

public class EmployeeDAOImpl implements IEmployeeDAO {

    /* rajes created on 7/18/2019
    inside the package - rajes.advjava.rmiserver.impl */

    @Override
    public String[][] getEmployeeList() {
        String employees[] [] = {{"10", "Tom"},
                                 {"20", "Jack"},
                                 {"30", "Sam"}
                                };
        return employees;
    }

}
