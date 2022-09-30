import React,{useState} from 'react';
import { Route, Routes,useNavigate} from 'react-router-dom';
import Login from './Login' ;


  function Root(){
    const navigate=useNavigate();
    const navigateLogin = () =>{
      navigate('/Login');
    };
    
  const [data,setData]=useState({
    User_role :'',
    Email :'',
    Username :'',
    Mobilenumber :'',
    Password :'',
    Confirm_Password :''
  })
  const {User_role,Username,Email,Mobilenumber,Password,Confirm_Password} = data;
  const changeHandler = e => {
    setData({...data,[e.target.name]:e.target.value})
  }
  const submitHandler = e => {
    e.preventDefault()
    if(Password === Confirm_Password){
      console.log(data)
    }
    else{
      console.log("Do not match with the password")
    }
    
  }
  
  return (
     
        <div>
        <center>
        <h1 className="my-4 font-weight-bold-display-4"> REGISTRATION </h1>
       
        <form autoComplete="off" onSubmit={submitHandler}>
         <label>User Role&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label> <input type="text" name="User_role" value={User_role} onChange={changeHandler}/> <br />  
         <label>Username&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label><input type="text" name="Username" value={Username} onChange={changeHandler}/> <br />
         <label>Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label><input type="Email" name="Email" value={Email} onChange={changeHandler}/> <br />
         <label>Mobilenumber&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label><input type="text" name="Mobilenumber" value={Mobilenumber} onChange={changeHandler}/> <br />
         <label>Password&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label><input type="password" name="Password" value ={Password} onChange={changeHandler}/> <br />
         <label>Confirm Password&nbsp;&nbsp;: </label><input type="password" name="Confirm_Password" value ={Confirm_Password} onChange={changeHandler}/> <br />
          <input type="submit" name="submit" onSubmit={submitHandler}/><h4>Already a user?</h4> <button onClick={navigateLogin}>Login</button>
      
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

  
