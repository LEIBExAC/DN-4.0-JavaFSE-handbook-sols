import React, { useState } from "react";
import CurrencyConverter from "./CurrencyConverter";

function App() {
  const [count, setCount] = useState(0);

  const increment = () => {
    setCount((prev) => prev + 1);
    sayHello();
  };

  const decrement = () => {
    setCount((prev) => prev - 1);
  };

  const sayHello = () => {
    alert("Hello, Member!");
  };

  const sayWelcome = (message) => {
    alert(message);
  };

  const handleClick = (event) => {
    alert("I was clicked");
  };

  return (
    <div className="App">
      <p>{count}</p>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>
      <br />
      <button onClick={() => sayWelcome("welcome")}>Say Welcome</button>
      <button onClick={handleClick}>Click on me</button>

      <CurrencyConverter />
    </div>
  );
}

export default App;
