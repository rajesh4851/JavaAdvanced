package impl;

import java.io.Serializable;
import java.rmi.server.UnicastRemoteObject;

import

public class EmployeeImpl extends UnicastRemoteObject implements IEmployee, Serializable {
/* rajes created on 7/18/2019 
inside the package - impl */
private static final long serialVersionUID = 1L;
private IEmployeeDAO employeeDAO = new EmployeeDAOImpl();

}