package com.employeepayroll;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;
import java.util.Scanner;

    public class EmployeePayrollService {
    public enum IOService { CONSOLE_IO, FILE_IO, DB_IO, REST_IO}
    private List<EmployeePayrollData> employeePayrollList;
    public EmployeePayrollService() {}
    public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList){...}

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);

    }

}
