-- correto: sentinel-sqlnorma-trigger-fora-do-padrao
CREATE TRIGGER TRG_Cliente_AI ON Cliente AFTER INSERT AS BEGIN SELECT 1 END;
