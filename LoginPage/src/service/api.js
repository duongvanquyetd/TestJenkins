// api.js (file cấu hình Axios)
import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8080/api', 
});

// Tự động thêm token vào mỗi request
api.interceptors.request.use(
  (config) => {
    const token = localStorage.getItem('token');
    if (token) {
      config.headers['Authorization'] = `Bearer ${token}`;
    }
    return config;
  },
  (error) => Promise.reject(error)
);

export default api;
