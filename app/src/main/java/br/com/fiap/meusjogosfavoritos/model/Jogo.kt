package br.com.fiap.meusjogosfavoritos.model

data class Jogo (
    val resourceId: Int,
    val nome: String,
    val anoLancamento: Int,
    val descricao: String
)