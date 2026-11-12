// correto: sentinel-ts-react-key-indice
export function Lista({ itens }: { itens: { id: number; nome: string }[] }) {
  return (
    <ul>
      {itens.map((item) => <li key={item.id}>{item.nome}</li>)}
    </ul>
  );
}
