package tema2.orm.hibernateIntro

import jakarta.persistence.EntityManagerFactory
import jakarta.persistence.Persistence

fun main() {
    val emf: EntityManagerFactory = Persistence.createEntityManagerFactory("unidadMySQL")
    val em = emf.createEntityManager()
}