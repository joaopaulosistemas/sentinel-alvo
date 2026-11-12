import { useEffect } from 'react';

export function Tela() {
  // alvo: sentinel-ts-useeffect-async
  useEffect(async () => {
    await fetch('/api/itens');
  }, []);
  return null;
}
