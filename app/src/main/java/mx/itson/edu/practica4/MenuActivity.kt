package mx.itson.edu.practica4

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnAntojitos : Button = findViewById(R.id.btn_antojitos) as Button
        var btnEspecialidades : Button = findViewById(R.id.btn_especialidaes) as Button
        var btnCaldos : Button = findViewById(R.id.btn_sopas) as Button
        var btnCombinations : Button = findViewById(R.id.btn_combinatios) as Button
        var btnDrinks : Button = findViewById(R.id.btn_drinks) as Button
        var btnTortas : Button = findViewById(R.id.btn_tortas) as Button


        btnAntojitos.setOnClickListener {
            var intent : Intent = Intent(this, Productos::class.java)
            intent.putExtra("menuType", "Antojitos")
            startActivity(intent)

        }

        btnCombinations.setOnClickListener {
            var intent : Intent = Intent(this, Productos::class.java)
            intent.putExtra("menuType", "Combinations")
            startActivity(intent)

        }

        btnCaldos.setOnClickListener {
            var intent : Intent = Intent(this, Productos::class.java)
            intent.putExtra("menuType", "Sopas")
            startActivity(intent)

        }

        btnEspecialidades.setOnClickListener {
            var intent : Intent = Intent(this, Productos::class.java)
            intent.putExtra("menuType", "Especialidades")
            startActivity(intent)

        }

        btnDrinks.setOnClickListener {
            var intent : Intent = Intent(this, Productos::class.java)
            intent.putExtra("menuType", "Drinks")
            startActivity(intent)

        }

        btnTortas.setOnClickListener {
            var intent : Intent = Intent(this, Productos::class.java)
            intent.putExtra("menuType", "Tortas")
            startActivity(intent)

        }
    }
}