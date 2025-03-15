package br.edu.fatecpg.lista_android
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.lista_android.adapter.UserAdapter
import br.edu.fatecpg.lista_android.dao.UserDao

class ListActivity : AppCompatActivity(R.layout.activity_list) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val dao = UserDao()
        val users = dao.getUsers()
        Log.i("ListUsers", users.toString())

        val rvUsers = findViewById<RecyclerView>(R.id.rv_users)
        rvUsers.layoutManager = LinearLayoutManager(this)
        rvUsers.adapter = UserAdapter(users)
    }
}
