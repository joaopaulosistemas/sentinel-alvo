import { useEffect, useState } from 'react';
export function Relogio() {
  const [n, setN] = useState(0);
  // alvo: sentinel-mem-react-effect-sem-cleanup
  useEffect(() => {
    setInterval(() => setN((x) => x + 1), 1000);
  }, []);
  return <span>{n}</span>;
}
