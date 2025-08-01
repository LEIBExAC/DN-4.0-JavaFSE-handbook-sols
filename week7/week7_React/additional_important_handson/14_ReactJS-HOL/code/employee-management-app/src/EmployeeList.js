import React from 'react';
import { useTheme } from './ThemeContext';
import EmployeeCard from './EmployeeCard';

const employees = [
  { id: 1, name: 'John Doe', position: 'Software Engineer' },
  { id: 2, name: 'Jane Smith', position: 'Product Manager' },
  { id: 3, name: 'Samuel Green', position: 'UX Designer' },
];

function EmployeeList() {
  const { theme } = useTheme();

  return (
    <div className={`employee-list ${theme}`}>
      <h1>Employee List</h1>
      {employees.map((employee) => (
        <EmployeeCard key={employee.id} employee={employee} />
      ))}
    </div>
  );
}

export default EmployeeList;
