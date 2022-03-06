package com.example.gridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas = ArrayList<String>()

        frutas.add("Manzana")
        frutas.add("Plátano")
        frutas.add("Sandía")
        frutas.add("Durazno")

        var grid:GridView = findViewById(R.id.grid)
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, frutas)
        grid.adapter = adaptador

        grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, frutas.get(position), Toast.LENGTH_SHORT).show()
        }

    }
}