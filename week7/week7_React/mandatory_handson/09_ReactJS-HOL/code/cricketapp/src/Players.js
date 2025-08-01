export const players = [
  { name: "Jack", score: 50 },
  { name: "Michael", score: 70 },
  { name: "John", score: 90 },
  { name: "Steve", score: 65 },
  { name: "David", score: 40 },
  { name: "Robert", score: 75 },
  { name: "Daniel", score: 60 },
  { name: "Chris", score: 85 },
  { name: "Mark", score: 30 },
  { name: "Paul", score: 95 },
  { name: "Tom", score: 55 },
];

export const OddPlayers = ({ names }) => {
  const [first, , third, , fifth] = names;

  return (
    <div>
      <h3>Odd Players:</h3>
      <ul>
        <li>{first}</li>
        <li>{third}</li>
        <li>{fifth}</li>
      </ul>
    </div>
  );
};

export const EvenPlayers = ({ names }) => {
  const [, second, , fourth, , sixth] = names;

  return (
    <div>
      <h3>Even Players:</h3>
      <ul>
        <li>{second}</li>
        <li>{fourth}</li>
        <li>{sixth}</li>
      </ul>
    </div>
  );
};

export const ListOfIndianPlayers = () => {
  const T20Players = ["Virat", "Rohit"];
  const RanjiTrophyPlayers = ["Pujara", "Rahane"];
  const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div>
      <h3>Merged Indian Players:</h3>
      <ul>
        {IndianPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};