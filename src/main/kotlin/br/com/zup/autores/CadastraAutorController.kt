package br.com.zup.autores

import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.validation.Validated
import javax.transaction.Transactional
import javax.validation.Valid


@Validated
@Controller("/autores")
class CadastraAutorController(val autorRepository: AutorRepository) {

    @Post
    @Transactional
    fun cadastra(@Body @Valid request: NovoAutorRequest){
        val autor = request.toAutor()
        autorRepository.save(autor)
        println("Autor ${autor.nome}")
    }
}