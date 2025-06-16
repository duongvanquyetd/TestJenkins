import './App.css';
// Updated to match the correct file name
import { LoginPage } from './component/page/login';

import { BrowserRouter, Routes, Route } from 'react-router-dom';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Dashboard } from './component/page/dashboard';


function App() {
  return (
    <BrowserRouter>
      <Routes>

        <Route path="/user/login" element={<LoginPage />} />
        <Route path="/dashboard" element={<Dashboard />} />

      </Routes>
    </BrowserRouter>
  );
}

export default App;