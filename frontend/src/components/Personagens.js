import { useEffect, useState } from 'react';
import axios from 'axios';

function Personagens() {
  const [personagens, setPersonagens] = useState([]);
  const [novo, setNovo] = useState({ nome: '', classe: '', nivel: 1 });

  useEffect(() => {
    axios.get('http://localhost:8080/api/personagens')
      .then(res => setPersonagens(res.data))
      .catch(err => console.error(err));
  }, []);

  const adicionar = () => {
    axios.post('http://localhost:8080/api/personagens', novo)
      .then(res => setPersonagens([...personagens, res.data]));
  };

  return (
    <div style={{ padding: 20 }}>
      <h2>Personagens</h2>
      <input placeholder="Nome" value={novo.nome} onChange={e => setNovo({ ...novo, nome: e.target.value })} />
      <input placeholder="Classe" value={novo.classe} onChange={e => setNovo({ ...novo, classe: e.target.value })} />
      <input type="number" placeholder="Nível" value={novo.nivel} onChange={e => setNovo({ ...novo, nivel: parseInt(e.target.value) })} />
      <button onClick={adicionar}>Adicionar</button>

      <ul>
        {personagens.map(p => (
          <li key={p.id}>{p.nome} - {p.classe} - Nível {p.nivel}</li>
        ))}
      </ul>
    </div>
  );
}

export default Personagens;