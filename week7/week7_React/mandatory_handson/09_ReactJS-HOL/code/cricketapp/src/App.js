import React from "react";
import { players, OddPlayers, EvenPlayers, ListOfIndianPlayers } from "./Players";


function App() {
  const flag = false;
  const players70 = players.filter((player) => player.score < 70);
  const playerNames = players.map((p) => p.name);

  return (
    <div className="App">
      {flag ? (
        <>
          <h3>List of Players:</h3>
          <ul>
            {players.map((item, index) => (
              <li key={index}>
                Mr. {item.name} = {item.score}
              </li>
            ))}
          </ul>

          <h3>Players with Score &lt; 70:</h3>
          <ul>
            {players70.map((item, index) => (
              <li key={index}>
                {item.name} = {item.score}
              </li>
            ))}
          </ul>
        </>
      ) : (
        <>
          <OddPlayers names={playerNames} />
          <EvenPlayers names={playerNames} />
          <ListOfIndianPlayers />
        </>
      )}
    </div>
  );
}

export default App;
