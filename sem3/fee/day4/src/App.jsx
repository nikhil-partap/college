import {useState, useEffect} from "react";
// import heroImg from "./assets/hero.png";
// import reactLogo from "./assets/react.svg";
// import viteLogo from "./assets/vite.svg";
import "./App.css";

/**
 i have to  add this in this project 
 fetch('https://dummyjson.com/users')
.then(res => res.json())
.then(console.log);
so  its like i am searching for a user by name and then displaying the result in the browser - 
using react and fetch api
 */

function App() {
  const [name, setName] = useState("");
  const [getByName, setGetByName] = useState([]); // why did we use array here because we are going to get an array of users from the api
  const [debounse, setDebounse] = useState(""); // we are using this state to store the debounced value of the name input field

  // we are making a lot of requests to the api when the user is typing in the input field, so we can use useEffect to make the api call only when the name changes and not on every render
  useEffect(() => {
    if (name.trim() === "") {
      return; // we are returning here so that the fetch api will not be called when the name is empty
    }
    let timer = setTimeout(() => {
      setDebounse(name); // we are setting the debounced value of the name input field after 500ms
    }, 500);

    return () => {
      clearTimeout(timer); // we are clearing the timer when the component unmounts or when the name changes
    };
  }, [name]);

  useEffect(() => {
    if (debounse.trim() === "") {
      return; // we are returning here so that the fetch api will not be called when the name is empty
    }

    fetch(`https://dummyjson.com/users/search?q=${debounse}`)
      .then((res) => res.json())
      .then((data) => setGetByName(data.users)); // we are setting the state with the users array from the api response
  }, [debounse]); // we are using name as a dependency so that whenever the name changes, the useEffect will run again and fetch the new data

  const user = (user) => {
    // we are using this function to render the user data in the browser -
    // how is this function working? we are passing the user object as a parameter and then returning the jsx to render the user data in the browser
    return (
      // we are using the user id as a key because it is unique for each user
      <li key={user.id}>
        {user.firstName} {user.lastName}
      </li>
    );
  };

  return (
    <>
      <h1>All users</h1>
      <input
        type="text"
        placeholder="Search name"
        value={name}
        onChange={(e) => setName(e.target.value)}
      ></input>
      <ol>{name.trim !== "" && getByName.length > 0 && getByName.map(user)}</ol>
      {/* // the list should
      only appear when the user types something in the input field, so we can
      use a conditional rendering here */}
    </>
  );
}

export default App;
