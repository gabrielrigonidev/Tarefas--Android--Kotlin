package br.edu.fatecpg.lista_tarefas
import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import br.edu.fatecpg.lista_tarefas.dao.TarefaDao
import br.edu.fatecpg.lista_tarefas.model.Tarefa
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtNome: EditText = findViewById(R.id.edt_nome)
        val edtDescricao: EditText = findViewById(R.id.edt_desc)
        val edtPrazo: EditText = findViewById(R.id.edt_prazo)
        val btnCadastrar: Button = findViewById(R.id.btn_cadastrar)
        val fabList: FloatingActionButton = findViewById(R.id.fab_list)
        val dao = TarefaDao()

        btnCadastrar.setOnClickListener{
            val nome = edtNome.text.toString()
            val descricao = edtDescricao.text.toString()
            val prazo = edtPrazo.text.toString()
            val tarefa = Tarefa(nome, descricao, prazo)
            dao.addTarefa(tarefa)

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Sucesso")
            builder.setMessage("Criado com sucesso!")
            val dialog = builder.create()
            dialog.show()
            edtNome.text.clear()
            edtDescricao.text.clear()
            edtPrazo.text.clear()
        }

        fabList.setOnClickListener{
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

    }
}