package escalante.rene.cartelera

data class Pelicula(
    val id: Int,
    val titulo: String,
    val anio: Int,
    val duracionMin: Int,
    val genero: String,
    val director: String,
    val sinopsis: String,
    val imagen: Int
)

val peliculas = listOf(
    Pelicula(
        id = 1,
        titulo = "Toy Story",
        anio = 1995,
        duracionMin = 81,
        genero = "Animación",
        director = "John Lasseter",
        sinopsis = "Woody, el juguete favorito de Andy, ...",
        imagen = R.drawable.toy_story
    ),
    Pelicula(
        id = 2,
        titulo = "Coco",
        anio = 2017,
        duracionMin = 92,
        genero = "Animación",
        director = "Lee Unkrich",
        sinopsis = "Miguel entra al mundo de los muertos, ...",
        imagen = R.drawable.coco
    ),
    Pelicula(
        id = 3,
        titulo = "Interstellar",
        anio = 2014,
        duracionMin = 173,
        genero = "Ciencia Ficcion",
        director = "Christopher Nolan",
        sinopsis = "Gracias a un descubrimiento, un grupo de científicos, ...",
        imagen = R.drawable.interstellar
    ),
    Pelicula(
        id = 4,
        titulo = "Jurassic Park",
        anio = 1993,
        duracionMin = 127,
        genero = "Ciencia Ficcion",
        director = "Steven Spielberg",
        sinopsis = "Tres expertos y otras personas son invitados a un parque de diversiones,, ...",
        imagen = R.drawable.jurassic_park
    ),
    Pelicula(
        id = 5,
        titulo = "Avengers",
        anio = 2026,
        duracionMin = 165,
        genero = "Ciencia Ficcion",
        director = "Joe Russo",
        sinopsis = "Un grupo de superherores tiene que enfrentar a la peor amenaza para, ...",
        imagen = R.drawable.avengers
    ),
    Pelicula(
        id = 6,
        titulo = "Volver al Futuro",
        anio = 1985,
        duracionMin = 116,
        genero = "Ciencia Ficcion",
        director = "Robert Zemeckis",
        sinopsis = "Una máquina del tiempo transporta a un adolescente a los años 50, ...",
        imagen = R.drawable.volver_al_futuro
    )
)
