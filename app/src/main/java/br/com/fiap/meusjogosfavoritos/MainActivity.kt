package br.com.fiap.meusjogosfavoritos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.fiap.meusjogosfavoritos.adapter.JogosAdapter
import br.com.fiap.meusjogosfavoritos.model.Jogo
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMeusJogos.adapter = JogosAdapter(carregaJogos(),this) {
            // Toast.length_short é o tempo em que o toast ficará sendo mostrado em tela
            Toast.makeText(this, it.nome, Toast.LENGTH_SHORT).show()
        }
        rvMeusJogos.layoutManager = LinearLayoutManager(this)
    }
    private fun carregaJogos(): List<Jogo> {
        return listOf(
            Jogo(R.drawable.god_of_war,
                "God of War",
                2018,
                "God of War é um jogo eletrônico de ação-aventura desenvolvido pela SIE Santa Monica Studio e publicado pela Sony Interactive Entertainment. Foi lançado em 20 de abril de 2018 para o PlayStation 4. É o oitavo jogo da série God of War e a sequência dos eventos ocorridos em God of War III. O título é um recomeço para a franquia e leva a série para o mundo da mitologia nórdica — todos os jogos anteriores tinham como cenário a mitologia grega. Kratos retorna como o protagonista e agora tem ao seu lado um filho chamado Atreus. Kratos atua como um mentor e protetor de Atreus e tem de dominar a raiva que o impulsionou por muitos anos."),
            Jogo(R.drawable.mario_odyssey,
                "Super Mario Odyssey",
                2017,
                "Super Mario Odyssey é um jogo de plataforma desenvolvido pela Nintendo Entertainment Planning & Development e publicado pela Nintendo. Foi lançado mundialmente em 27 de outubro de 2017 exclusivamente para o Nintendo Switch. É o sétimo jogo de plataforma tridimensional na série principal Super Mario, retornando para o projeto de nível mais livre visto em Super Mario 64 e Super Mario Sunshine. No jogo, o icônico chapéu de Mario torna-se um personagem próprio (Cappy)."),
            Jogo(R.drawable.sonic,
                "Mario Kart",
                1992,
                "Mario Kart é uma série de jogos de corrida desenvolvida e publicada pela Nintendo como spin-off da franquia Mario. O primeiro da série, Super Mario Kart, foi lançado em 1992 para o Super Nintendo Entertainment System e é considerado um dos jogos mais influentes da história, e seguramente a maior referência em termos de Spin-off."),
            Jogo(R.drawable.sonic,
                "Sonic Mania",
                2017,
                "Sonic Mania é um jogo eletrônico side-scrolling de plataforma desenvolvido pela PagodaWest Games e Headcannon. Faz parte da série Sonic the Hedgehog e retorna para a jogabilidade 2D e o estilo visual original dos jogos Mega Drive. Foi lançado para PC, Nintendo Switch, PlayStation 4 e Xbox One em 15 de Agosto de 2017."),
            Jogo(R.drawable.crash_bandicoot,
                "Crash Bandicoot",
                1996,
                "Crash Bandicoot é uma série de jogos criada por Andy Gavin e Jason Rubin que são inclusive os fundadores da Naughty Dog. A série consiste basicamente nas aventuras do bandicoot geneticamente alterado Crash, que luta para impedir o planos do cientista do mal Neo Córtex e seus lacaios. A história do jogo se passa nas fictícias Ilhas Wumpa, um arquipélago situado na costa noroeste da Austrália, mas outros lugares são revelados. A série começou em 1996 e no momento, a franquia contém um total de 18 jogos diferentes e já vendeu cerca de 56 milhões e meio de cópias no mundo, se tornando uma das séries de jogos eletrônicos mais vendidas de sempre."))
    }
}
