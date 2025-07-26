import React from "react";
import styles from "./CohortDetails.module.css";

/** Since I did not get the 'cohottracker.zip' so I created my own setup to display the list and to show the styling. Also I am adding 1-2 more tracker in the list.*/
const CohortDetails = () => {
  const cohorts = [
    {
      name: "INTADMDF10 - .NET FSD",
      startDate: "22-Feb-2022",
      status: "Scheduled",
      coach: "Jojo Jose",
      trainer: "Aathma",
    },
    {
      name: "ADM21JF014 - Java FSD",
      startDate: "10-Sep-2021",
      status: "Ongoing",
      coach: "Apoorv",
      trainer: "Elisa Smith",
    },
    {
      name: "CDBJF21025 - Java FSD",
      startDate: "24-Dec-2021",
      status: "Ongoing",
      coach: "Aathma",
      trainer: "John Doe",
    },
    {
      name: "WEBDEV3001 - Web Development",
      startDate: "15-Nov-2021",
      status: "Completed",
      coach: "Neil Bart",
      trainer: "Tina James",
    },
    {
      name: "MLAI1001 - Machine Learning",
      startDate: "01-Jan-2022",
      status: "Ongoing",
      coach: "Ferry Quic",
      trainer: "David Jones",
    },
  ];

  return (
    <div>
      <h2>Cohorts Details</h2>
      <div className={styles.cohortList}>
        {cohorts.map((cohort, index) => (
          <div key={index} className={styles.box}>
            <h3
              style={{ color: cohort.status === "Ongoing" ? "green" : "blue" }}
            >
              {cohort.name}
            </h3>
            <dt>Started On: </dt>
            <dd>{cohort.startDate}</dd>
            <dt>Current Status: </dt>
            <dd>{cohort.status}</dd>
            <dt>Coach: </dt>
            <dd>{cohort.coach}</dd>
            <dt>Trainer: </dt>
            <dd>{cohort.trainer}</dd>
          </div>
        ))}
      </div>
    </div>
  );
};

export default CohortDetails;
