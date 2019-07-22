package rajes.advjava.rmiserver.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeDAOImplTest {
    EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

    @Test
    public void getEmployeeList() throws Exception{
        String [][] employeeList = employeeDAO.getEmployeeList();
        assertNotNull(employeeList);
    }
}