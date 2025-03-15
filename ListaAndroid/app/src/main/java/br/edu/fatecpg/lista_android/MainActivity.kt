package br.edu.fatecpg.lista_android
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.lista_android.dao.UserDao
import br.edu.fatecpg.lista_android.model.User
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtName:EditText = findViewById(R.id.edt_name)
        val btnSave:Button = findViewById(R.id.btn_salve)
        val fabList:FloatingActionButton = findViewById(R.id.fab_list)
        val dao = UserDao()

        btnSave.setOnClickListener{
            val name = edtName.text.toString()
            val user = User(name)
            dao.addUser(user)

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sucesso")
            builder.setMessage("Criado com sucesso!")
            val dialog = builder.create()
            dialog.show()
            edtName.text.clear()
        }

        fabList.setOnClickListener{
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }
}