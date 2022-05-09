package ramizbek.aliyev.instagramui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import ramizbek.aliyev.instagramui.R
import ramizbek.aliyev.instagramui.User

class Adapter (var list : ArrayList<User>) : RecyclerView.Adapter<Adapter.Vh>() {

    inner class Vh(var itemView: View) : RecyclerView.ViewHolder(itemView){
        fun onBind(user : User){

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
       holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

}