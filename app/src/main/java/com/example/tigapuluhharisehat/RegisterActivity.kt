package com.example.tigapuluhharisehat

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Mendapatkan referensi ke elemen-elemen UI
        val edtNama = findViewById<EditText>(R.id.edtNama)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)
        val btnRegister = findViewById<Button>(R.id.btnRegister)
        val imgProfile = findViewById<ImageView>(R.id.imgProfile)

        // Set contentDescription untuk ImageView (optional)
        imgProfile.contentDescription = "Logo Makanan Sehat"

        // Event klik pada tombol Register
        btnRegister.setOnClickListener {
            val nama = edtNama.text.toString().trim()
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()

            // Validasi input
            if (nama.isEmpty()) {
                edtNama.error = getString(R.string.nama_empty)
                edtNama.requestFocus()
            } else if (email.isEmpty()) {
                edtEmail.error = getString(R.string.email_empty)
                edtEmail.requestFocus()
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                edtEmail.error = getString(R.string.invalid_email)
                edtEmail.requestFocus()
            } else if (password.isEmpty()) {
                edtPassword.error = getString(R.string.password_empty)
                edtPassword.requestFocus()
            } else {
                // Registrasi berhasil
                Toast.makeText(this, getString(R.string.registration_success), Toast.LENGTH_SHORT).show()

                // Navigasi ke LoginActivity setelah registrasi berhasil
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()  // Menutup RegisterActivity
            }
        }
    }
}
