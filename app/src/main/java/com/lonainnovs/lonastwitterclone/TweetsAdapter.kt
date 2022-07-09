package com.lonainnovs.lonastwitterclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetsAdapter(var tweets:List<Tweet>):RecyclerView.Adapter<TweetsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.twitter_clone_list,parent,false)
    return TweetsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var currentTweet = tweets.get(position)
        holder.tvLikes.text = currentTweet.likes
        holder.tvHandle.text = currentTweet.handle
        holder.tvTweet.text = currentTweet.tweet
        holder.tvMessages.text = currentTweet.messages
        holder.tvRetweet.text = currentTweet.retweets
    }

    override fun getItemCount(): Int {
        return tweets.size
    }

}

class TweetsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var imgAvatar = itemView.findViewById<ImageView>(R.id.imgAvatar)
    var tvHandle = itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet = itemView.findViewById<TextView>(R.id.tvTweet)
    var tvRetweet=itemView.findViewById<TextView>(R.id.tvRetweet)
    var tvMessages=itemView.findViewById<TextView>(R.id.tvMessages)
    var tvLikes=itemView.findViewById<TextView>(R.id.tvLikes)
    var imgShare=itemView.findViewById<ImageView>(R.id.imgShare)
    var imgRetweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgMessages= itemView.findViewById<ImageView>(R.id.imgMessages)
    var imgLike=itemView.findViewById<ImageView>(R.id.imgLike)


}
