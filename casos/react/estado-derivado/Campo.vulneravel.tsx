import { useState } from 'react';
export function Campo(props: { valor: string }) {
  // alvo: sentinel-react-estado-derivado
  const [v, setV] = useState(props.valor);
  return <input value={v} onChange={(e) => setV(e.target.value)} />;
}
