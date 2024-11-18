DELIMITER ;;
CREATE FUNCTION preco_custo_produto (id_prod INT)
RETURNS DECIMAL(8,2) NOT DETERMINISTIC
BEGIN
    DECLARE r DECIMAL(8,2);
    SELECT preco_custo INTO r FROM produto  WHERE id = id_prod LIMIT 1;
    RETURN r;
END;
;;
DELIMITER ;
