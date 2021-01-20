(deftemplate Persona
	(slot nombre
		(type STRING)
		(default ?DERIVE)
	)
	(slot apellido
		(type STRING)
		(default ?DERIVE)
	)
	(slot dia
		(type INTEGER)
		(default 1)
		(range 1 31)
	)
	(slot mes
		(type INTEGER)
		(default 1)
		(range 1 12)
	)
	(slot anio
		(type INTEGER)
		(default 1900)
		(range 1900 2020)
	)
)

(deftemplate personalidad
	(multislot tipos
		(type STRING)
		(default ?DERIVE)
	)
	(multislot caracteristicas
		(type STRING)
		(default ?DERIVE)
	)

)

(deftemplate entrada
	(slot res
		(type STRING)
		(default ?DERIVE)
	)
)

(deftemplate resultado
	(multislot nombre
		(type STRING)
		(default ?DERIVE)
	)
	(multislot tipo
		(type STRING)
		(default ?DERIVE)
	)
	(slot edad
		(type INTEGER)
		(default 1)
		(range 1 200)
	)


)


(defrule informacion
	(personalidad (tipos $?tip) (caracteristicas $?car))
	(Persona (nombre ?n) (apellido ?a) (dia ?d) (mes ?m) (anio ?an))
	(entrada (res ?t))
=>

		(loop-for-count (?i 1 (length$ ?tip)) do
		(bind ?aux (nth$ ?i ?tip))
		(if (= (str-compare ?aux ?t) 0) then
			(bind ?ed (- 2020 ?an))
			(assert(resultado (nombre ?n) (tipo (nth$ ?i ?car)) (edad ?ed))))

		)

)
