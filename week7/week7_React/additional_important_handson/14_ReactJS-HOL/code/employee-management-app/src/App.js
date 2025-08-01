import React from 'react';
import { ThemeProvider, useTheme } from './ThemeContext';
import EmployeeList from './EmployeeList';
import ThemeToggleButton from './ThemeToggleButton';
import './App.css';

function App() {
  return (
    <ThemeProvider>
      <ThemedApp />
    </ThemeProvider>
  );
}

function ThemedApp() {
  const { theme } = useTheme();

  return (
    <div className={`App ${theme}`}>
      <ThemeToggleButton />
      <EmployeeList />
    </div>
  );
}

export default App;
