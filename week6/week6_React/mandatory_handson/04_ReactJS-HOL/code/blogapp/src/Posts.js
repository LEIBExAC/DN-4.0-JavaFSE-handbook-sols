import React from "react";

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      error: null,
    };
  }

  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => this.setState({ posts: data }))
      .catch((error) => this.setState({ error: error.message }));
  }

  componentDidMount() {
    this.loadPosts(); // Fetch the posts when the component mounts
  }
  render() {
    const { posts, error } = this.state;

    if (error) {
      return <h2>Error: {error}</h2>;
    }

    return (
      <div>
        <h1 style={{color: "Green"}}>Blog Posts</h1>
        {posts.length === 0 ? (
          <p>Loading posts \/</p>
        ) : (
          posts.map((post) => (
            <div key={post.id}>
              <h2>{post.title}</h2>
              <p>{post.body}</p>
            </div>
          ))
        )}
      </div>
    );
  }

  componentDidCatch(error, info) {
    this.setState({ error: error.message });
  }
}

export default Posts;
