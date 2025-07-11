## Filename : 3. spring-rest-handson

Create REST service to gets all employees Follow steps below to accomplish this activity:

    · In EmployeeService, incorporate the following:

        o Change the annotation for this class from @Component to @Service
        o Create method getAllEmployees() that invokes employeeDao.getAllEmployees() and return the employee list
        o Define @Transactional annotation for this method.

    · In EmployeeController, incorporate the following:

        o Include a new get method with name getAllEmployees() that returns the employee list
        o Mark this method as GetMapping annotation with the URL as '/employees'
        o Within this method invoke employeeService.getAllEmployees() and return the same.

    · Test the service using postman.