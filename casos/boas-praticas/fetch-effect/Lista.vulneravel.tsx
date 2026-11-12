import { useEffect, useState } from 'react';
export function Lista() {
  const [d, setD] = useState<unknown[]>([]);
  useEffect(() => {
    // alvo: sentinel-boas-react-fetch-em-effect
    fetch('/api/itens').then((r) => r.json()).then(setD);
  }, []);
  return <ul>{d.length}</ul>;
}
