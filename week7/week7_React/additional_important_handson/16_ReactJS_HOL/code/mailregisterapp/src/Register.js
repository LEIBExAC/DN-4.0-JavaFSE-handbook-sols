import React, { Component } from "react";

class Register extends Component {
  constructor(props) {
    super(props);
    this.state = {
      fullName: "",
      email: "",
      password: "",
      errors: {
        fullName: "",
        email: "",
        password: "",
      },
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);
    this.validateForm = this.validateForm.bind(this);
  }

  handleChange(event) {
    this.setState({ [event.target.name]: event.target.value });
  }

  validateForm(errors) {
    let valid = true;
    Object.values(errors).forEach((val) => val.length > 0 && (valid = false));
    return valid;
  }

  handleSubmit(event) {
    event.preventDefault();

    const errors = { ...this.state.errors };

    if (this.state.fullName.length < 5) {
      errors.fullName = "Full Name must be 5 characters long";
    } else {
      errors.fullName = "";
    }

    const validEmailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!validEmailRegex.test(this.state.email)) {
      errors.email = "Email is not valid";
    } else {
      errors.email = "";
    }

    if (this.state.password.length < 8) {
      errors.password = "Password must be at least 8 characters";
    } else {
      errors.password = "";
    }

    this.setState({ errors });

    if (this.validateForm(errors)) {
      alert("Valid Form");
    }
  }

  render() {
    return (
      <div style={{ textAlign: "center", marginTop: "50px" }}>
        <h1 style={{ color: "red" }}>Register Here!!!</h1>
        <form onSubmit={this.handleSubmit}>
          <div>
            <label>Name:</label>
            <input
              type="text"
              name="fullName"
              value={this.state.fullName}
              onChange={this.handleChange}
              required
            />
            {this.state.errors.fullName && (
              <div style={{ color: "red" }}>{this.state.errors.fullName}</div>
            )}
          </div>
          <br />
          <div>
            <label>Email:</label>
            <input
              type="email"
              name="email"
              value={this.state.email}
              onChange={this.handleChange}
              required
            />
            {this.state.errors.email && (
              <div style={{ color: "red" }}>{this.state.errors.email}</div>
            )}
          </div>
          <br />
          <div>
            <label>Password:</label>
            <input
              type="password"
              name="password"
              value={this.state.password}
              onChange={this.handleChange}
              required
            />
            {this.state.errors.password && (
              <div style={{ color: "red" }}>{this.state.errors.password}</div>
            )}
          </div>
          <br />
          <button type="submit">Submit</button>
        </form>
      </div>
    );
  }
}

export default Register;
