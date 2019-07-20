package rajes.advjava.rmiserver.impl;

import rajes.advjava.rmiserver.IEmployee;

import java.io.Serializable;
import java.rmi.RemoteException;

public class EmployeeImpl implements IEmployee, Serializable {
/* rajes created on 7/18/2019 
inside the package - rajes.advjava.rmiserver.impl */
private static final long serialVersionUID = 1L;
protected EmployeeImpl() throws RemoteException {
    super();
}

@Override
public String getEmployeeWithId(int id) throws RemoteException {
    return null;
}
}
