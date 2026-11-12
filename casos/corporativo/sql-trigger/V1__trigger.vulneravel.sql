-- alvo: sentinel-sqlnorma-trigger-fora-do-padrao
CREATE TRIGGER minha_trigger ON Cliente AFTER INSERT AS BEGIN SELECT 1 END;
