import { useEffect, useState } from 'react'
// import Main1 from './components/Main1.jsx';
import { BrowserRouter, Routes, Route, NavLink, Outlet } from 'react-router-dom';
import './App.css'
import Home from './components/Home';

function App() {
  // const [count, setCount] = useState(0)
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
      {/* <Nav /> */}
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Nav />}>
            <Route index element={<Home />} />
            <Route path='/about' element={<h1>Hello About</h1>} />
            <Route path='/contact' element={<h1>Say Hello to me at this mail <a href="mailto:rohitkhatri.dev@gmail.com">Gmail</a></h1>} />
          </Route>
        </Routes>
      </BrowserRouter>
    </>
  )
}

export default App


function Nav() {
  return (
    <>
      <nav>
        <NavLink to='/'>Home</NavLink>
        <NavLink to='/about'>About</NavLink>
        <NavLink to='/contact'>Contact</NavLink>
      </nav>
      <Outlet />
      <footer>
        Design and Created By .rohitkhatri
      </footer>
    </>
  )
}