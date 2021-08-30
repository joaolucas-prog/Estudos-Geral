import React, { useState, useEffect } from 'react';

import Header from './components/Header'
import './App.css';
import backgroundImage from './assets/background.jpg'
import api from './services/api'

export default function App() {
  const [projects, setProjects] = useState([]);
  
  useEffect(() => {
    api.get('projects').then(response => {
      setProjects(response.data);
    });
  }, []);

  async function handleAddProject() {
    const response = await api.post('projects', {
      title: `Novo projeto : ${Date.now()}`,
      owner: 'dev'
    });
    const project = response.data;
    setProjects([...projects, project]);
  }

  return (
    <>
      <Header title="HomePage" >
      <img width={300} src={backgroundImage}/>
        <ul>
          {projects.map(project => (
            <li key={project.id}>{project.title}</li>)
          )}
        </ul>
        <button type="button" onClick={handleAddProject}>Adicionar novo projeto</button>
      </Header>
    </>
  );
}