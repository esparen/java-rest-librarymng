CREATE TABLE public.bibliotecarios (
                                       id bigint NOT NULL,
                                       email character varying(255) NOT NULL,
                                       nome character varying(255) NOT NULL,
                                       senha character varying(255) NOT NULL
);


CREATE SEQUENCE public.bibliotecarios_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.bibliotecarios_id_seq OWNED BY public.bibliotecarios.id;
ALTER TABLE ONLY public.bibliotecarios ALTER COLUMN id SET DEFAULT nextval('public.bibliotecarios_id_seq'::regclass);


CREATE TABLE public.emprestimo (
                                   id bigint NOT NULL,
                                   data_devolucao date,
                                   data_emprestimo date NOT NULL,
                                   id_livro bigint,
                                   id_membro bigint
);

CREATE SEQUENCE public.emprestimo_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.emprestimo_id_seq OWNED BY public.emprestimo.id;
ALTER TABLE ONLY public.emprestimo ALTER COLUMN id SET DEFAULT nextval('public.emprestimo_id_seq'::regclass);

CREATE TABLE public.livro (
                              id bigint NOT NULL,
                              ano_publicacao integer NOT NULL,
                              autor character varying(255),
                              titulo character varying(255) NOT NULL
);


CREATE SEQUENCE public.livro_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.livro_id_seq OWNED BY public.livro.id;
ALTER TABLE ONLY public.livro ALTER COLUMN id SET DEFAULT nextval('public.livro_id_seq'::regclass);

--membros
CREATE TABLE public.membros (
                                id bigint NOT NULL,
                                endereco character varying(255),
                                nome character varying(255),
                                telefone character varying(255)
);

CREATE SEQUENCE public.membros_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
ALTER SEQUENCE public.membros_id_seq OWNED BY public.membros.id;
ALTER TABLE ONLY public.membros ALTER COLUMN id SET DEFAULT nextval('public.membros_id_seq'::regclass);


CREATE TABLE public.visitante (
                                  id bigint NOT NULL,
                                  nome character varying(255) NOT NULL,
                                  telefone character varying(255) NOT NULL
);

CREATE SEQUENCE public.visitante_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.visitante_id_seq OWNED BY public.visitante.id;
ALTER TABLE ONLY public.visitante ALTER COLUMN id SET DEFAULT nextval('public.visitante_id_seq'::regclass);


ALTER TABLE ONLY public.bibliotecarios
    ADD CONSTRAINT bibliotecarios_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.emprestimo
    ADD CONSTRAINT emprestimo_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.livro
    ADD CONSTRAINT livro_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.membros
    ADD CONSTRAINT membros_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.visitante
    ADD CONSTRAINT visitante_pkey PRIMARY KEY (id);

ALTER TABLE ONLY public.emprestimo
    ADD CONSTRAINT fk9o80s7i3wn6ks727ytgmudti4 FOREIGN KEY (id_livro) REFERENCES public.livro(id);

ALTER TABLE ONLY public.emprestimo
    ADD CONSTRAINT fkge45vsdof9bp97qn7a2w72ojo FOREIGN KEY (id_membro) REFERENCES public.membros(id);