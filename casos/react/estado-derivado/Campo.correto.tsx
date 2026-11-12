// correto: sentinel-react-estado-derivado
import { useState } from 'react';
export function Campo({ inicial }: { inicial: string }) {
  const [v, setV] = useState(inicial);
  return <input value={v} onChange={(e) => setV(e.target.value)} />;
}
