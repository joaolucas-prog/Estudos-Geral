import React, { useState } from 'react';

import Header from './components/Header'
import './App.css';
import backgroundImage from './assets/background.jpg'

export default function App() {
  const [projects, setProjects] = useState(['Desenvolvimento Web', 'Desenvolvimento mobile']);

  function handleAddProject() {
    setProjects([ ...projects, `Novo projeto : ${Date.now()}` ]);
    console.log(projects);
  }

  return (
    <>
      <Header title="HomePage" >
      <img width={300} src={backgroundImage}/>
        <ul>
          {projects.map(project => (
            <li key={project}>{project}</li>)
          )}
        </ul>
        <button type="button" onClick={handleAddProject}>Adicionar novo projeto</button>
      </Header>
    </>
  );
}