package com.tega.retrofit.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tega.retrofit.models.User

class RetrofitUserAdapter(var users: List<User>): RecyclerView.Adapter<RetrofitUserAdapter.UserViewHolder>() {

    class UserViewHolder(private  val binding: UserItemBinding):
            RecyclerView.ViewHolder(binding.root){
                fun bindUser(user: User){

                }
            }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}