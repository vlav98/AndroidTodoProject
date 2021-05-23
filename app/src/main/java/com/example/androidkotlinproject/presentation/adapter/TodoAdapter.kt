/*
package com.example.androidkotlinproject.presentation.adapter

import android.R
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.CompoundButton
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.androidkotlinproject.data.model.Todo


class TodoAdapter(
    private val todoList: ArrayList<Todo>
) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    lateinit var callback: Callback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int { return todoList.size }


    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(todoList.get(position))
    }

    // Sets the callback
    fun setCallback(callback: Callback) {
        this.callback = callback
    }

    // Callback interface, used to notify when an item's checked status changed
    interface Callback {
        fun onCheckedChanged(item: String?, isChecked: Boolean)
    }

    class TodoViewHolder(todoView: View) : RecyclerView.ViewHolder(todoView) {
        lateinit var CheckBox: checkBox

        fun ViewHolder(itemView: View) {
            super(itemView)
            // Find the checkbox view in the layout
            checkBox = itemView.findViewById<View>(R.id.checkbox) as CheckBox
        }

        fun bind(string: String?) {
            // Set the text
            checkBox.setText(string)

            // Listen to changes (i.e. when the user checks or unchecks the box)
            checkBox.setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener { buttonView, isChecked -> // Invoke the callback
                if (callback != null) callback.onCheckedChanged(string, isChecked)
            })
        }
    }
}*/
