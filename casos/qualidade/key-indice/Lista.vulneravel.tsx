export function Lista({ itens }: { itens: { id: number; nome: string }[] }) {
  return (
    <ul>
      // alvo: sentinel-ts-react-key-indice
      {itens.map((item, i) => <li key={i}>{item.nome}</li>)}
    </ul>
  );
}
