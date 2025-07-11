## Filename : 5. spring-rest-handson

Create authentication service that returns JWT As part of first step of JWT process, the user credentials needs to be sent to authentication service request that generates and returns the JWT. Ideally when the below curl command is executed that calls the new authentication service, the token should be responded. Kindly note that the credentials are passed using -u option. Request

curl -s -u user:pwd http://localhost:8090/authenticate

Response

{"token":"eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwiaWF0IjoxNTcwMzc5NDc0LCJleHAiOjE1NzAzODA2NzR9.t3LRvlCV-hwKfoqZYlaVQqEUiBloWcWn0ft3tgv0dL0"}

This can be incorporated as three major steps:

· Create authentication controller and configure it in SecurityConfig

· Read Authorization header and decode the username and password

· Generate token based on the user retrieved in the previous step

Let incorporate the above as separate hands on exercises.