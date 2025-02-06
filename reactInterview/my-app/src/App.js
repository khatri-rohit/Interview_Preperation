import { useEffect, useState,Fragment } from 'react';
import React from 'react';
import './App.css';

function App() {

  const [count, setValue] = useState(0);
  const sum = () => {
    try {
      console.log(setValue);
      // count++;
    } catch (error) {
      console.log(error.message);
    }
    setValue(count + 1);
    // count++;
  }

  const [val, setVal] = useState("Hello One Liner")

  const hello = () => {
    return <h1>{val}</h1>
  };

  useEffect(() => {
    // first
    hello();
    setVal("");
    // return () => {
    //   second
    console.log(count);
    // }
  }, [count])


  return (
    <Fragment>
      <div className="App">
        <header className="App-header">
          <button onClick={sum}>Count {count}</button>
          <p>
            Edit <code>src/App.js</code> and save to reload.
          </p>
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React
          </a>
        </header>
      </div>
    </Fragment>
  );
}

export default App;
