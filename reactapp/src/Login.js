import React,{useState} from 'react';
import { Navigate } from 'react-router';
import { Route, Routes,useNavigate} from 'react-router-dom';
import Signup from './Signup';

  function Root(){
    const navigate=useNavigate();
    const navigateSignup=()=>{
      navigate('/Signup');
    }
 
  const [auth,setAuth]=useState(false);
 

  const [data,setData]=useState({
    email :'',
    Password :''
  })
  if(auth){
    return <Navigate to='/Viewacademy' />
  }
  const {email,Password} = data;
  const changeHandler = e => {
    setData({...data,[e.target.name]:e.target.value})
  }
  const submitHandler = e => {
    e.preventDefault()
   
  }
  return (
    <div>
       
      <center>

        <h1> LOGIN </h1>
        <form autoComplete="off" onSubmit={submitHandler}>
        <label>email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label><input type="text" name="email" value={email} onChange={changeHandler}/> <br />
        <label>Password&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;: </label> <input type="password" name="Password" value ={Password} onChange={changeHandler}/> <br />
        <button onClick={()=>setAuth(true)}>Login</button><h4>New Admin/User?</h4><button onClick={navigateSignup}>Signup</button>
       
          <Routes>
        <Route path="/Signup" exact element={<Signup/>} />
        </Routes>
         
        </form>
      </center>
     
       
   
    </div>
  );
}
 
function Login() {
  return (
   
      <Root />
   
  );
}

export default Login;
