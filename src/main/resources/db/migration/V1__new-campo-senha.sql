-- Aumenta o tamanho do campo senha na tabela usuario
ALTER TABLE public.usuario ALTER COLUMN senha SET DATA TYPE VARCHAR(255);
