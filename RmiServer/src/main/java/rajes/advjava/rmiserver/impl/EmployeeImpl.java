package rajes.advjava.rmiserver.impl;

import rajes.advjava.rmiserver.IEmployee;
import rajes.advjava.rmiserver.IEmployeeDAO;

import java.io.Serializable;
import java.rmi.RemoteException;

public class EmployeeImpl implements IEmployee, Serializable {
/* rajes created on 7/20/2019 
inside the package - rajes.advjava.rmiserver.impl */
protected EmployeeImpl() throws RemoteException {
    super();
}

    @Override
    public String getEmployeeNameWithId(int id) throws RemoteException {
    String name = null;
        IEmployeeDAO employeeDAO = new EmployeeDAOImpl();
        String [][] employeeList =    employeeDAO.getEmployeeList();
        for (int i = 0; i< employeeList.length; i++) {
            String[] idName = employeeList[i];
            if(Integer.parseInt(idName[0]) == id) {
                name = idName[1];
                break;
            }

        }
        return name;
    }
}
