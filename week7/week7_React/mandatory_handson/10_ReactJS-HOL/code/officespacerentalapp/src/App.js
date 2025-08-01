import React from "react";
import "./App.css";

function App() {
  const imageSrc =
    "https://images.pexels.com/photos/380768/pexels-photo-380768.jpeg";
  const heading = "Office Space";
  const ItemName = {
    Name: "DBS",
    Rent: 50000,
    Address: "Chennai",
  };

  let colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push("textRed");
  } else {
    colors.push("textGreen");
  }

  return (
    <div className="App">
      <h1>{heading}, at Affordable Range</h1>
      <div className="content">
        <img src={imageSrc} width="25%" height="25%" alt="Office Space" />
        <h2>Name: {ItemName.Name}</h2>
        <h3 className={colors.join(" ")}>Rent: Rs.{ItemName.Rent}</h3>
        <h3>Address: {ItemName.Address}</h3>
      </div>
    </div>
  );
}

export default App;
