export function Texto({ html }: { html: string }) {
  // alvo: sentinel-react-dangerously
  return <div dangerouslySetInnerHTML={{ __html: html }} />;
}
