import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";
import "./App.css";

const books = [
  { id: 101, bname: "Master React", price: 670 },
  { id: 102, bname: "Deep Dive into Angular 11", price: 800 },
  { id: 103, bname: "Mongo Essentials", price: 450 },
];

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const toggleLogin = () => {
    setIsLoggedIn((prev) => !prev);
  };

  return (
    <div className="App">
      <div>
        {isLoggedIn ? (
          <div className="container-up">
            <div className="st2">
              <BookDetails books={books} />
            </div>
            <div className="mystyle1">
              <CourseDetails />
            </div>
          </div>
        ) : (
          <div>
            <h1>Please log in to access Book and Course details</h1>
          </div>
        )}
      </div>

      <div className="v1">
        <BlogDetails />
      </div>

      <button onClick={toggleLogin}>{isLoggedIn ? "Logout" : "Login"}</button>
    </div>
  );
}

export default App;
