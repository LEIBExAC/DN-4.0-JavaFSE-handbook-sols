import React, { Component } from "react";

class GetUser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      person: {},
      loading: true,
    };
  }

  async componentDidMount() {
    const url = "https://api.randomuser.me/";
    const response = await fetch(url);
    const data = await response.json();

    this.setState({ person: data.results[0], loading: false });

    console.log(data.results[0]);
  }

  render() {
    const { person, loading } = this.state;

    if (loading) {
      return <h1>Loading...</h1>;
    }

    return (
      <div style={{ textAlign: "center" }}>
        <h1>
          {person.name.title} {person.name.first} {person.name.last}
        </h1>
        <img src={person.picture.large} alt="User" />
      </div>
    );
  }
}

export default GetUser;
