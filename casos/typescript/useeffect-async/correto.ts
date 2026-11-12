// correto: sentinel-ts-useeffect-async
import { useEffect } from 'react';

export function Tela() {
  useEffect(() => {
    (async () => { await fetch('/api/itens'); })();
  }, []);
  return null;
}
