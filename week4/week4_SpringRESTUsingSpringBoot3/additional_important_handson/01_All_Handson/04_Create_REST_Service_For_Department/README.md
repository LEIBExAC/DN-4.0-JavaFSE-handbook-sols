## Filename : 3. spring-rest-handson

Create REST service for department
Create a new service to get all the departments.
Follow steps below to achieve this:

    · Create a new REST Service, define below list of classes and respective methods:

        o DepartmentController

            § getAllDepartments() with URL "/departments", this method will return array of departments

        o DepartmentService
            
            § getAllDepartments()

        o DepartmentDao

            § getAllDepartments() - Create a static variable DEPARTMENT_LIST, this should be populated from spring xml configuration

    · Test the service using postman.
    · Also verify if department REST service is called by looking into the logs.e.