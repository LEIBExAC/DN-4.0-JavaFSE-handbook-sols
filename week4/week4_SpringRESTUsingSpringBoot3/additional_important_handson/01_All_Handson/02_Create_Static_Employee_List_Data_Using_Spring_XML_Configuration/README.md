## Filename : 3. spring-rest-handson

Create static employee list data using spring xml configuration Follow steps below to accomplish this activity:

    · Incorporate the following in employee.xml:

        o Create one or two more departments
        o Create four more instances of Employee. (use employee sample data from angular)
        o Reuse existing skills instead of creating new ones
        o Include all four employee instances in an ArrayList.

    · In EmployeeDao, incorporate the following:

        o Create static variable with name EMPLOYEE_LIST of type ArrayList<Employee>
        o Include constructor that reads employee list from xml config and set the EMPLOYEE_LIST
        o Create method getAllEmployees() that returns the EMPLOYEE_LIST