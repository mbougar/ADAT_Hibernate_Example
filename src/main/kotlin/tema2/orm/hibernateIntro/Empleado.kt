package tema2.orm.hibernateIntro

import jakarta.persistence.Column
import jakarta.persistence.Id
import jakarta.persistence.Table

// Importamos @Table para declarar que la clase es una tabla

@Table(name="Empleados")
class Empleado(

    // Con @Id declaramos que la columna es la clave primaria de la tabla
    @Id
    val id: String,

    @Column(name="Nombre")
    val nombre: String,

    @Column
    val edad: Int
) {
}