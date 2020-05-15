package com.example.atanase

import com.example.atanase.models.NewsPost

class DataSource {

    companion object {
        fun createDataSet(): ArrayList<NewsPost> {
            val list = ArrayList<NewsPost>()

            list.add(
                NewsPost(
                    "All about berries",
                    "Everything you wanted to know about the nutriets and benefits that berries bring!",
                    "https://cdn.pixabay.com/photo/2020/05/12/16/24/raspberries-5163812_960_720.jpg"
                )
            )
            list.add(
                NewsPost(
                    "One more news title",
                    "Summary of news and more",
                    "https://cdn.pixabay.com/photo/2020/05/11/15/14/squirrel-5158715_960_720.jpg"
                )
            )
            list.add(
                NewsPost(
                    "Squirrels take over the planet",
                    "Experts are worried we might never recover",
                    "https://cdn.pixabay.com/photo/2012/02/28/00/48/animal-17819_960_720.jpg"
                )
            )
            list.add(
                NewsPost(
                    "Deer in the woods",
                    "They are just strolling",
                    "https://cdn.pixabay.com/photo/2016/11/12/11/51/forest-1818690_960_720.jpg"
                )
            )
            list.add(
                NewsPost(
                    "Local forest looks stunning",
                    "Random text generator",
                    "https://cdn.pixabay.com/photo/2015/12/01/20/28/road-1072823_960_720.jpg"
                )
            )

         return list

        }
    }
}