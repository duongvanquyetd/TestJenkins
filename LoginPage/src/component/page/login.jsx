import { useState } from "react";
import { useNavigate } from "react-router-dom";

export const LoginPage = () => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const navigator = useNavigate();
function login()
{
  if(username === "test" && password === "test")
  {
    navigator('/dashboard')
  }
}
/////////test
  return (
    <div >
    UserName  <input type="text" id="username" onChange={(e)=> setUsername(e.target.value)}/><br></br>
     Password  <input type="password" id="password" onChange={(e)=> setPassword(e.target.value)}/><br></br>
      <button id="loginButton" onClick={login}>Login</button>

    </div>
  );
};