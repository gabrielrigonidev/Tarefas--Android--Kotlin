package br.edu.fatecpg.conversor_temperatura
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val edtCelsius = findViewById<EditText>(R.id.edt_celsius)
        val txvFahrenheit = findViewById<TextView>(R.id.txv_fahrenheit)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener{
            val fahrenheit = edtCelsius.text.toString()
            txvFahrenheit.text = "Fahrenheit: $fahrenheit"
        }
    }
}