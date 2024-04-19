
SELECT pg_catalog.setval('public.bibliotecarios_id_seq', 2, true);

SELECT pg_catalog.setval('public.emprestimo_id_seq', 4, true);

SELECT pg_catalog.setval('public.livro_id_seq', 2, true);

SELECT pg_catalog.setval('public.membros_id_seq', 2, true);

SELECT pg_catalog.setval('public.visitante_id_seq', 2, true);


INSERT INTO public.bibliotecarios VALUES (2, 'another@email.com', 'Eder Sparenberger', 'password12123');

INSERT INTO public.livro VALUES (1, 2026, 'Ederson Sparenberger', 'Fluxo Épico');

INSERT INTO public.membros VALUES (2, 'Rua Teste', 'Ederson Sparenberger 2', '(51)999136046');
INSERT INTO public.membros VALUES (1, 'Rua Teste 2', 'E S', '(51)35905110');

INSERT INTO public.visitante VALUES (2, 'E S', '(51)35905110');

INSERT INTO public.emprestimo VALUES (1, NULL, '2024-04-16', 1, 1);
INSERT INTO public.emprestimo VALUES (4, '2024-04-08', '2024-04-02', 1, 1);
INSERT INTO public.emprestimo VALUES (2, '2024-01-01', '2024-01-01', 1, NULL);

