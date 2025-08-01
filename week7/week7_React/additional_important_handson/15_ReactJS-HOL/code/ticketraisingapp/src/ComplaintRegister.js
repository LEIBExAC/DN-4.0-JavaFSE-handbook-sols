import React, { Component } from "react";

class ComplaintRegister extends Component {
  constructor(props) {
    super(props);
    this.state = {
      ename: "",
      complaint: "",
      NumberHolder: "",
    };

    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
  }

  handleChange(event) {
    this.setState({ [event.target.name]: event.target.value });
  }

  handleSubmit(event) {
    event.preventDefault();

    const referenceNumber = Math.floor(100000 + Math.random() * 900000);

    this.setState({ NumberHolder: referenceNumber });

    const msg = `Thanks ${this.state.ename}! \nYour complaint was submitted. \nYour Complaint ID is: ${this.state.NumberHolder}`;

    alert(msg);
  }

  render() {
    return (
      <div>
        <h1 style={{ textAlign: "center", color: "red" }}>
          Register your complaints here!!!
        </h1>
        <form onSubmit={this.handleSubmit} style={{ textAlign: "center" }}>
          <div>
            <label>
              Name:
              <input
                type="text"
                name="ename"
                value={this.state.ename}
                onChange={this.handleChange}
                placeholder="Enter your name"
                required
              />
            </label>
          </div>

          <div>
            <label>
              Complaint:
              <textarea
                name="complaint"
                value={this.state.complaint}
                onChange={this.handleChange}
                placeholder="Enter your complaint"
                required
              />
            </label>
          </div>

          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default ComplaintRegister;
