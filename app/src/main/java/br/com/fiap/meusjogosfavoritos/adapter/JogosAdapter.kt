package br.com.fiap.meusjogosfavoritos.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.meusjogosfavoritos.R
import br.com.fiap.meusjogosfavoritos.model.Jogo
import kotlinx.android.synthetic.main.jogo_item.view.*

class JogosAdapter(
    private val jogos: List<Jogo>,
    private val context: Context,
    val listener: (Jogo) -> Unit
) : RecyclerView.Adapter<JogosAdapter.ViewHolder>() {
    //Método que recebe o ViewHolder e a posição da lista.
    //Aqui é recuperado o objeto da lista de Objetos pela posição e associado à ViewHolder, onde o próprio adapter passa por baixo dos panos a posição e o viewHolder que ele precisa
    // não cria todos os itens, ele cria os que vão aparecer em tela e mais um ou dois, reciclando conforme scroll
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(jogos[position], listener)
    }

    //Método que deverá retornar layout criado pelo ViewHolder já inflado em uma view.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.jogo_item, parent,
            false)
        return ViewHolder(view)
    }

    //Método que deverá retornar quantos itens há na lista.
    override fun getItemCount(): Int {
        return jogos.size
    }

    // Com o ViewHolder iremos relacionar o layout criado e adicionar os valores a ele //
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindView(
            jogo: Jogo,
            listener: (Jogo) -> Unit
        // o with(itemView) tá falando de onde são as propriedades que estão sendo acessadas mais abaixo
        ) = with(itemView) {
            ivJogo.setImageDrawable(ContextCompat.getDrawable(context,
                jogo.resourceId))
            tvNome.text = jogo.nome
            tvAnoLancamento.text = jogo.anoLancamento.toString()
            tvDescricao.text = jogo.descricao
            setOnClickListener { listener(jogo) }
        }
    }
}


