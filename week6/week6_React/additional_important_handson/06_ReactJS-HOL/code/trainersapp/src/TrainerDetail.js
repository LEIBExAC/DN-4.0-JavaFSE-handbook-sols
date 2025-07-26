import React from "react";
import { useParams } from "react-router-dom";
import trainersMock from "./TrainersMock";

const TrainerDetail = () => {
  const { id } = useParams();
  const trainer = trainersMock.find((trainer) => trainer.TrainerId === id);

  return (
    <div>
      {trainer ? (
        <div>
          <h2>Trainer Details</h2>
          <p>
            <b>
              {trainer.Name} ({trainer.Technology})
            </b>
          </p>
          <p>Email: {trainer.Email}</p>
          <p>Phone: {trainer.Phone}</p>

          <h3>Skills</h3>
          <ul>
            {trainer.Skills.map((skill, index) => (
              <li key={index}>{skill}</li>
            ))}
          </ul>
        </div>
      ) : (
        <p>Trainer not found</p>
      )}
    </div>
  );
};

export default TrainerDetail;
