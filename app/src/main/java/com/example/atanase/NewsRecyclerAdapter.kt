package com.example.atanase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.atanase.models.NewsPost
import kotlinx.android.synthetic.main.layout_news_feed_item.view.*

class NewsRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<NewsPost> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
          return NewsViewHolder(
              LayoutInflater.from(parent.context).inflate(R.layout.layout_news_feed_item, parent, false)
          )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is NewsViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(newsList: List<NewsPost>){
        items = newsList
    }

    class NewsViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val newsImage = itemView.news_image
        val newsTitle = itemView.news_title
        val newsSummary = itemView.news_summary

        fun bind(newsPost: NewsPost){

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(newsPost.image)
                .into(newsImage)
            newsTitle.setText(newsPost.title)
            newsSummary.setText(newsPost.body)
        }
    }

}