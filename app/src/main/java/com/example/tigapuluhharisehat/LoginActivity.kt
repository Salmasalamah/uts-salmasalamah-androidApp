package com.example.tigapuluhharisehat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.util.Patterns

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Pastikan layout ini ada

        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            // Validasi input
            if (email.isEmpty()) {
                edtEmail.error = getString(R.string.email_empty)
                edtEmail.requestFocus()
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                edtEmail.error = getString(R.string.invalid_email)
                edtEmail.requestFocus()
            } else if (password.isEmpty()) {
                edtPassword.error = getString(R.string.password_empty)
                edtPassword.requestFocus()
            } else {
                // Sukses login (simulasi)
                Toast.makeText(this, getString(R.string.login_success), Toast.LENGTH_SHORT).show()

                // Navigasi ke ListChatActivity setelah login berhasil
                val intent = Intent(this, ListChatActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
