import React from "react";
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom";
import TrainersList from "./TrainersList";
import Home from "./Home";
import TrainerDetail from "./TrainerDetail";
import trainersMock from "./TrainersMock";

const App = () => {
  return (
    <div>
      <div>
        <h1>My Academy Trainers App</h1>
      </div>
      <Router>
        <nav>
          <ul>
            <li>
              <Link to="/">Home</Link>
            </li>
            <li>
              <Link to="/trainers">Show Trainers</Link>
            </li>
          </ul>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route
            path="/trainers"
            element={<TrainersList trainers={trainersMock} />}
          />
          <Route path="/trainers/:id" element={<TrainerDetail />} />
        </Routes>
      </Router>
    </div>
  );
};

export default App;
