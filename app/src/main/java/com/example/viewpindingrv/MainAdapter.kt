package com.example.viewpindingrv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.viewpindingrv.databinding.RecyclerviewItemBinding

class MainAdapter(var taskList:List<Task>): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(val itemBinding:RecyclerviewItemBinding):RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(task: Task){

                itemBinding.Title.text = task.title
                itemBinding.timeTv.text = task.timestamp

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val task =taskList[position]
        holder.bindItem(task)
           // return holder.bindItem(taskList[position])

    }

    override fun getItemCount(): Int {
        return taskList.size
    }

}