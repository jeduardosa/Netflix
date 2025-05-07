package com.omeghabit.netflix

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.omeghabit.netflix.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val validEmail = "123"
    private val validPassword = "123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            validaConta()
        }
    }

    private fun validaConta(){
        val email = binding.loginCamp.text.toString().trim()
        val password = binding.passwordCamp.text.toString().trim()

        when {
            email.isEmpty() -> {
                Toast.makeText(this, "Digite seu e-mail", Toast.LENGTH_SHORT).show()
            }
            password.isEmpty() -> {
                Toast.makeText(this, "Digite sua senha", Toast.LENGTH_SHORT).show()
            }
            email != validEmail || password != validPassword ->{
                Toast.makeText(this, "Usuário ou Senha inválidos", Toast.LENGTH_SHORT).show()
            }
            else -> dasboardSeries()
        }

    }
    private fun dasboardSeries(){
        val intent = Intent(this, DashMenuActivity::class.java)
        startActivity(intent)
        finish()
    }
}
