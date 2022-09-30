import React from 'react';
import Navbar from './Navbar';
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import Useracademy from './Useracademy';
import Userenrolledcourses from './Userenrolledcourses' ;



  function Root(){
  
  return (
    <div>
      <BrowserRouter>
     
       
      <Navbar />
      <Routes>
        <Route path="/Useracademy" exact element={<Useracademy/>} />
        <Route path="/Userenrolledcourses" exact element={<Userenrolledcourses/>} />
        
      </Routes>
    
     </BrowserRouter>
    </div>
  );
}



export default Root;
