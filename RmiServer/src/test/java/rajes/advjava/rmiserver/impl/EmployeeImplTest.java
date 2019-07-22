package rajes.advjava.rmiserver.impl;

import org.junit.Test;
import rajes.advjava.rmiserver.IEmployee;

import java.rmi.RemoteException;

import static org.junit.Assert.*;

public class EmployeeImplTest {

    @Test
    public void getEmployeeNameWithId() throws RemoteException {
        IEmployee employee = new EmployeeImpl();
        String getName1 = null;
        String getName2 = null;
        // This is my testcase1
        getName1 = employee.getEmployeeNameWithId(10);
        System.out.println("1st test case output is :"+getName1);  // not required to print, rather create test case
        assertEquals("Tom", getName1);

//        // This is my testcase2
//        getName2 = employee.getEmployeeNameWithId(20);
//        System.out.println("2nd test case output is :"+getName2);
//        assertEquals("Peter",getName2);

    }

}