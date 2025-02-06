import { useEffect, useState } from 'react'
import Main1 from './components/Main1.jsx';
import './App.css'

function App() {
  const [count, setCount] = useState(0)
  const obj = { name: "Rohit", surname: "Kharti" };
  // const arr = [1, 2, 3];
  // const obj1 = [...obj];

  useEffect(() => {
    (() => {
      // const ob1 = 
      console.log({ ...obj });
      console.log("Rohit Khatri React Interview");
    })();
  }, [])

  return (
    <>
      <h1>Vite + React</h1>
      <div className="card">
        <button onClick={() => setCount((count) => count + 1)}>
          count is {count}
        </button>
        <p>
          Edit <code>src/App.jsx</code> and save to test HMR
        </p>
        <Main1 obj={obj} />
      </div>
      <p className="read-the-docs">
        Click on the Vite and React logos to learn more
      </p>
    </>
  )
}

export default App
