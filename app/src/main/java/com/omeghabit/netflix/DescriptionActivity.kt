package com.omeghabit.netflix

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.omeghabit.netflix.data.Series
import com.omeghabit.netflix.databinding.ActivityDescriptionBinding

class DescriptionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDescriptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDescriptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val serie = intent.getParcelableExtra<Series>("SERIE")
        serie?.let { updateViews(it) } ?: showError()
    }

    private fun updateViews(serie: Series) {
        with(binding) {
            textTitulo.text = serie.nome
            textSinopse.text = serie.descricao.toString()
            imgBanner.setImageResource(serie.imagemId)
        }
    }

    private fun showError() {
        Toast.makeText(this, "Dados não encontrados", Toast.LENGTH_SHORT).show()
        finish()
    }
}