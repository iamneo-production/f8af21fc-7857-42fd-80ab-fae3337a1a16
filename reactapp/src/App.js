import React,{useEffect, useState} from 'react';
import Navbar from './Navbar';
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import Signup from './Signup';
import Login from './Login' ;
import axios from 'axios';


  function Root(){
    const[data,setData]=useState([]);
    useEffect(()=>{
      axios.get("http://localhost:8080").then(
        response=>setData(response.data)
      )
    },[])
  return (
    <div>
      <BrowserRouter>
      <Navbar />
      <Routes>
        <Route path="/Signup/*" exact element={<Signup/>} />
        <Route path="/Login/*" exact element={<Login/>} /> 
      </Routes>
     </BrowserRouter>
     {data.map(student=><li key={student.studentId}>{student.studentname}</li>)}
    </div>
  );
}



export default Root;
