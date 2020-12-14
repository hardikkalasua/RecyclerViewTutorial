package com.example.recyclerviewtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        val data = arrayListOf(
                RowItem("Rick Sanchez",
                        "wubbalubbadubdub",
                        R.drawable.rick),

                RowItem("Morty Smith",
                        "Oh jeez",
                        R.drawable.morty),

                RowItem("Summer Smith",
                        "i'm so important",
                        R.drawable.summer),

                RowItem("Beth Smith",
                        "I run this house",
                        R.drawable.beth),

                RowItem("Jerry Smith",
                        "I hate rick",
                        R.drawable.jerry),

                RowItem("Rick Sanchez",
                        "wubbalubbadubdub",
                        R.drawable.rick),

                RowItem("Morty Smith",
                        "Oh jeez",
                        R.drawable.morty),

                RowItem("Summer Smith",
                        "i'm so important",
                        R.drawable.summer),

                RowItem("Beth Smith",
                        "I run this house",
                        R.drawable.beth),

                RowItem("Jerry Smith",
                        "I hate rick",
                        R.drawable.jerry),
        )

        val adapter = MyRecyclerViewAdapter(data)
        recyclerView.adapter = adapter

        val mLayoutManager = LinearLayoutManager(this)
        val mDividerItemDecoration = DividerItemDecoration(
                this, mLayoutManager.orientation
        )
        recyclerView.layoutManager = mLayoutManager
        recyclerView.addItemDecoration(mDividerItemDecoration)
    }
}