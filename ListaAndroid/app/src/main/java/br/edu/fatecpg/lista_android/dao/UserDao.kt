package br.edu.fatecpg.lista_android.dao

import br.edu.fatecpg.lista_android.model.User

class UserDao {
    companion object{
       private val users = mutableListOf<User>()
    }

    fun addUser(user:User){
        users.add(user)
    }

    fun getUsers():List<User>{
        return users
    }
}