enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} matriculado na formação $nome.")
    }

    fun listarInscritos() {
        println("Inscritos na formação $nome:")
        inscritos.forEach { println(it.nome) }
    }
}

fun main() {
    val usuario1 = Usuario("Timóteo")
    val usuario2 = Usuario("Dima")
    val usuario3 = Usuario("Pereira")
    val usuario4 = Usuario("Benício")
	 
    val conteudo4 = ConteudoEducacional("Lógica de Programação para Iniciante")
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos")
    val conteudo3 = ConteudoEducacional("Kotlin para análise de Dados")
   
  

    val formacao = Formacao("Desenvolvimento em Kotlin", listOf(conteudo1, conteudo2, conteudo3, conteudo4))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)
    formacao.matricular(usuario4)

    formacao.listarInscritos()
}
