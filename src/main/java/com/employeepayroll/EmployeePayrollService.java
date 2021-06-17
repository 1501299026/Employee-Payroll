package com.employeepayroll;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

    public class EmployeePayrollService {
        public enum IOService {CONSOLE_TO, FILE_TO, DB_TO, REST_TO}
        private List<EmployeePayrollData> employeePayrollList;

        public EmployeePayrollService() {}

        public EmployeePayrollService(List<EmployeePayrollData>employeePayrollList){
            this.employeePayrollList = employeePayrollList;
        }

        public static void main(String[] args) {
            ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
            EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
            Scanner consoleInputReader = new Scanner(System.in);
            employeePayrollService.readEmployeePayrollData(consoleInputReader);
            employeePayrollService.writeEmployeePayrollData();
        }

        private void readEmployeePayrollData(@NotNull Scanner consoleInputReader){
            System.out.println("Enter Employee ID: ");
            int id = consoleInputReader.nextInt();
            System.out.println("Enter Employee Name: ");
            String name = consoleInputReader.next();
            System.out.println("Enter Employee Salary: ");
            Double salary = consoleInputReader.nextDouble();
            employeePayrollList.add(new EmployeePayrollData(id, name, salary));
        }

        private void writeEmployeePayrollData() {
            System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
        }
    }


