// correto: sentinel-mem-react-effect-sem-cleanup
import { useEffect, useState } from 'react';
export function Relogio() {
  const [n, setN] = useState(0);
  useEffect(() => {
    const t = setInterval(() => setN((x) => x + 1), 1000);
    return () => clearInterval(t);
  }, []);
  return <span>{n}</span>;
}
