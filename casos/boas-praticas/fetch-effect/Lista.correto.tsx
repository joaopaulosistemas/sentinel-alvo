// correto: sentinel-boas-react-fetch-em-effect
import { useQuery } from '@tanstack/react-query';
export function Lista() {
  const { data } = useQuery({ queryKey: ['itens'], queryFn: () => fetch('/api/itens').then((r) => r.json()) });
  return <ul>{data?.length}</ul>;
}
