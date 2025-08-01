import React from 'react';
import { useTheme } from './ThemeContext';

function EmployeeCard({ employee }) {
  const { theme } = useTheme();

  return (
    <div className={`employee-card ${theme}`}>
      <h3>{employee.name}</h3>
      <p>{employee.position}</p>
    </div>
  );
}

export default EmployeeCard;
