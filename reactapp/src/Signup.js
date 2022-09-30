import React,{useState} from 'react';
import {Route, Routes,useNavigate} from 'react-router-dom';
import Login from './Login' ;
import axios from 'axios';



  function Root(){
    const navigate=useNavigate();
    const navigateLogin = () =>{
      navigate('/Login');
    };
    
  const [data,setData]=useState({
    userrole :'',
    email :'',
    username :'',
    mobilenumber :'',
    password :'',
    confirmPassword :''
  })
  
  const {userrole,username,email,mobilenumber,password,confirmPassword} = data;
  const changeHandler = e => {
    setData({...data,[e.target.name]:e.target.value})
  }
  
   const submitHandler= (e) => {
      e.preventDefault();
    axios
          .post("https://8080-dfcddeeaacdacffffcbcfcaeccfaecbcfbbaf.examlyiopb.examly.io/addRegister",data)
          .then(response=>{
          alert("Registered success")
    }).catch(error=>{
      alert("Registration failed")
    })
     
    
    
  }
    
  
  return (
     
        <div>
        <center>
        <h1 className="my-4 font-weight-bold-display-4"> REGISTRATION </h1>
         
        <form autoComplete="off"  onSubmit={submitHandler} >
         <label>User Role&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label> <input type="text" name="userrole" value={userrole} onChange={changeHandler}/> <br />  
         <label>Username&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label><input type="text" name="username" value={username} onChange={changeHandler}/> <br />
         <label>Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label><input type="email" name="email" value={email} onChange={changeHandler}/> <br />
         <label>Mobilenumber&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label><input type="text" name="mobilenumber" value={mobilenumber} onChange={changeHandler}/> <br />
         <label>Password&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label><input type="password" name="password" value ={password} onChange={changeHandler}/> <br />
         <label>Confirm Password&nbsp;&nbsp;: </label><input type="password" name="confirmPassword" value ={confirmPassword} onChange={changeHandler}/> <br />
          <button type="submit" >Submit </button><h4>Already a user?</h4> <button onClick={navigateLogin}>Login</button>
      
         <Routes>
         <Route path="/Login" exact element={<Login/>} />
      </Routes>
        </form>
        
      
      
     </center> 
    
    </div>
  )};

  
function Signup() {
  return (
   
      <Root />
    
  );
}
  
export default Signup;

  
