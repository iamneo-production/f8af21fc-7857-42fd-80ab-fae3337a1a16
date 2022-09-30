import React from 'react';
import Navbar from './Navbar';
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import Signup from './Signup';
import Login from './Login' ;



  function Root(){
    
  return (
    <div>
      <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/Signup/*" exact element={<Signup/>} />
        <Route path="/Login/*" exact element={<Login/>} /> 
      </Routes>
     </BrowserRouter>
     
    </div>
  );
}



export default Root;
