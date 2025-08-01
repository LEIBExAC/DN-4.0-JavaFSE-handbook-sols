import React, { useState } from 'react';
import './App.css';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const [selectedView, setSelectedView] = useState('book'); 

  const toggleLogin = () => setIsLoggedIn(!isLoggedIn);

  let content;
  if (selectedView === 'book') {
    content = <BookDetails />;
  } else if (selectedView === 'blog') {
    content = <BlogDetails />;
  } else if (selectedView === 'course') {
    content = <CourseDetails />;
  }

  return (
    <div className="App">
      <h1>Welcome to the Blog Application</h1>

      {isLoggedIn ? (
        <div>
          <h2>You are logged in!</h2>
        </div>
      ) : (
        <div>
          <h2>Please log in to view more details</h2>
        </div>
      )}

      <button onClick={toggleLogin}>
        {isLoggedIn ? 'Logout' : 'Login'}
      </button>

      <hr />

      <div className='btn'>
        <button onClick={() => setSelectedView('book')}>Book Details</button>
        <button onClick={() => setSelectedView('blog')}>Blog Details</button>
        <button onClick={() => setSelectedView('course')}>Course Details</button>
      </div>

      <hr />

      {content}

      <div>
        {isLoggedIn ? (
          <h3>Enjoy browsing all the content!</h3>
        ) : (
          <h3>You must log in to view this content.</h3>
        )}
      </div>

      {isLoggedIn && <h4>Welcome back, user!</h4>}
    </div>
  );
}

export default App;
