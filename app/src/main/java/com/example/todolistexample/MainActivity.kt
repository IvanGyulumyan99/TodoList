package com.example.todolistexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todoList = mutableListOf(
            ToDo("First TODO", false),
            ToDo ("Second TODO", false),
            ToDo("Third TODO", false),
            ToDo("Fourth TODO", false),
            ToDo ("Fifth TODO", false),
            ToDo("Sixth TODO", false),
            ToDo("Seventh TODO", false),
            ToDo ("Eight TODO", false),
            ToDo("Nineth TODO", false)
        )

        val adapter = ToDoAdapter(todoList)
        rvTodo.adapter = adapter
        rvTodo.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title = etTodo.text.toString()
            val todo = ToDo(title, false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size - 1)
            etTodo.setText(" ")
        }
    }
}
