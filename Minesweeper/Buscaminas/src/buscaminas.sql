CREATE TABLE public."Player"(
	"IdPlayer" smallint NOT NULL,
	"Nombre" character varying(100) NOT NULL,
	"Puntaje" smallint NOT NULL,	
	CONSTRAINT "IdPlayer_pk" PRIMARY KEY ("IdPlayer")
);

