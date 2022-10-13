USE db_blogpessoal2;
INSERT INTO tb_postagem (data, texto, titulo)
VALUES (current_timestamp(), 'Texto da postagem 01', 'Postagem 01');
INSERT INTO tb_postagem (data, texto, titulo)
VALUES (current_timestamp(), 'Texto da postagem 02', 'Postagem 02');
SELECT * FROM tb_postagem;