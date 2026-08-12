import {useState} from "react";
// import reactLogo from "./assets/react.svg";
// import viteLogo from "./assets/vite.svg";
// import heroImg from "./assets/hero.png";
import "./App.css";

function App() {
  const [message, setMessage] = useState("");
  function greet() {
    setMessage(<h3>just a card</h3>);
  }

  return (
    <>
      <h1>Chitkara</h1>
      <h2>University </h2>
      <div style={{border: "1px solid #ccc"}}>
        <h3>My Card</h3>
        <p>This is a simple card.</p>
        <button onClick={greet}> Click Me </button>
        <p>{message}</p>
      </div>
      {/* <img src={heroImg} alt="hero image" width="500" ></img> */}
    </>
  );
}

export default App;
