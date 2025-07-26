import React, { Component } from "react";

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0,
    };
  }

  updateEntry = () => {
    this.setState({ entryCount: this.state.entryCount + 1 });
  };

  updateExit = () => {
    this.setState({ exitCount: this.state.exitCount + 1 });
  };

  render() {
    return (
      <div>
        <h1>People Counting</h1>
        <p>People entered the mall: {this.state.entryCount}</p>
        <p>People exited the mall: {this.state.exitCount}</p>

        <button onClick={this.updateEntry}>Login</button>
        <button onClick={this.updateExit}>Exit</button>
      </div>
    );
  }
}

export default CountPeople;
