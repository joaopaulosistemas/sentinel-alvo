// alvo: sentinel-cct-parametro-booleano
export function enviar(msg: string, urgente: boolean) { return urgente ? msg.toUpperCase() : msg; }
