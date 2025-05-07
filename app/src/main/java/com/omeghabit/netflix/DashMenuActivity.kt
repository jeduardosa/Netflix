package com.omeghabit.netflix

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.omeghabit.netflix.data.Series
import com.omeghabit.netflix.databinding.ActivityDashMenuBinding

class DashMenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashMenuBinding

    private val series = listOf(
        Series(
            "Breaking Bad",
            "     Conta a história de Walter White, um professor de química do ensino médio, que, diagnosticado com" +
                    "câncer terminal, decide usar seu conhecimento para fabricar e vender metanfetamina, com o objetivo de garantir o" +
                    "futuro financeiro da sua família. Ele se junta ao seu ex-aluno Jesse Pinkman para cozinhar a droga, e a trama" +
                    "acompanha a transformação de Walter de um homem pacato a um poderoso chefão do crime.",
            R.drawable.breakingbad
        ),
        Series(
            "Brooklyn 99",
            "    É uma comédia policial que acompanha a vida de uma equipe de detetives da 99ª Delegacia de Polícia" +
                    "de Nova York, no Brooklyn, liderada pelo rigoroso e intelectual Capitão Raymond Holt. A série gira" +
                    "em torno do talentoso, mas imaturo, detetive Jake Peralta, que se adapta à nova disciplina e regras impostas" +
                    "por Holt.",
            R.drawable.brooklyn
        ),
        Series(
            "House",
            "    Acompanha o Dr. Gregory House, um médico brilhante, mas anti-social, que trabalha no Hospital" +
                    "de Princeton-Plainsboro. Ele e sua equipe, apesar de seus métodos pouco convencionais e do humor ácido de House," +
                    "são especialistas em resolver casos médicos complexos e raros. A série explora não só os casos médicos, masn" +
                    "também a vida pessoal de House e seus relacionamentos com seus colegas e pacientes.",
            R.drawable.drhouse
        ),
        Series(
            "The Office",
            "    É uma sitcom que acompanha o dia a dia de um escritório da empresa fictícia Dunder Mifflin, em Scranton," +
                    "Pensilvânia. Através do formato de pseudodocumentário, a série mostra as relações entre os funcionários, as crises" +
                    "que enfrentam e os comportamentos peculiares do gerente regional, Michael Scott. A série, que é uma adaptação da" +
                    "versão britânica, explora a comédia e a humanidade do ambiente de trabalho, com personagens que são ao mesmo tempo" +
                    "engraçados e identificáveis.",
            R.drawable.theoffice
        ),
        Series(
            "One Piece",
            "    Conta a história de Monkey D. Luffy, um jovem com o corpo elástico que sonha em se tornar o Rei dos Piratas. Para isso," +
                    " ele reúne uma tripulação de piratas, os \"Chapéus de Palha\" e parte em uma jornada em busca do tesouro lendário" +
                    " \"One Piece\"",
            R.drawable.onepiece
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupClickListeners()
    }

    private fun setupClickListeners() {

        binding.imgBreakingBad.setOnClickListener { navigateToDescription(series[0]) }
        binding.imageBroo.setOnClickListener { navigateToDescription(series[1]) }
        binding.imageHouse.setOnClickListener { navigateToDescription(series[2]) }
        binding.imageOffice.setOnClickListener { navigateToDescription(series[3]) }
        binding.buttonInfo.setOnClickListener { navigateToDescription(series[4]) }
    }

    private fun navigateToDescription(serie: Series) {
        Intent(this, DescriptionActivity::class.java).apply {
            putExtra("SERIE", serie)
            startActivity(this)
        }
    }

}