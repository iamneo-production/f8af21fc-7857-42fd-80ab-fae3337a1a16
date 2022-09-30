import React from 'react';
import {Link} from 'react-router-dom';



const Navbar = () => {
    return (
        <div>
            <center-right>
            
                <Link to="/Signup"><h4>SIGNUP</h4></Link> 
                <Link to="/Login"><h4>LOGIN</h4></Link>
                      
                </center-right>
        </div>
    )
}
export default Navbar;