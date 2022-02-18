package com.example.instagramui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.instagramui.adapter.FeedAdapter
import com.example.instagramui.model.Feed
import com.example.instagramui.model.Post
import com.example.instagramui.model.Story

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    companion object {
        const val profile1 ="https://picsum.photos/500/300?random=12"

        const val profile2="https://picsum.photos/500/300?random=4"
        const val profile3 ="https://picsum.photos/500/300?random=5"

        const val profile4="https://picsum.photos/500/300?random=6"


        const val photo1 =
            "https://picsum.photos/500/300?random=3"
        const val photo2 =
            "https://picsum.photos/500/300?random=33"
        const val photo3 =
            "https://picsum.photos/500/300?random=42"
        const val photo4 =
            "https://picsum.photos/500/300?random=33"
        const val photo5 =
            "https://picsum.photos/500/300?random=123"

        const val video1 =
            "https://vod-progressive.akamaized.net/exp=1645096363~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F3400%2F21%2F542004485%2F2570352312.mp4~hmac=6726a3a94819327cf3134630bce9f0858506aca5403440abad56d5f1cb4f0573/vimeo-prod-skyfire-std-us/01/3400/21/542004485/2570352312.mp4?filename=pexels-mart-production-7667423.mp4"
        const val video2 =
            "https://vod-progressive.akamaized.net/exp=1645097242~acl=%2Fvimeo-prod-skyfire-std-us%2F01%2F2251%2F16%2F411256287%2F1766006419.mp4~hmac=859496a5d3b09cd410a0e08890353daddfb0586c0ff02b790d3951d1a783d464/vimeo-prod-skyfire-std-us/01/2251/16/411256287/1766006419.mp4?filename=production+ID%3A4228659.mp4"



    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()


    }

    fun initViews() {
        recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.setLayoutManager(GridLayoutManager(this, 1))

        refreshAdapter(getAllFeeds())
    }

    fun refreshAdapter(feeds: ArrayList<Feed>) {
        val adapter = FeedAdapter(this, feeds)
        recyclerView!!.adapter = adapter
    }

    fun getAllFeeds(): ArrayList<Feed> {

        val stories: ArrayList<Story> = ArrayList<Story>()
        stories.add(Story(profile1,"shodiyor"))
        stories.add(Story(profile1,"shodiyor"))
        stories.add(Story(profile1,"shodiyor"))
        stories.add(Story(profile1,"shodiyor"))
        stories.add(Story(profile1,"shodiyor"))
        stories.add(Story(profile1,"shodiyor"))
        stories.add(Story(profile1,"shodiyor"))


        val feeds: ArrayList<Feed> = ArrayList<Feed>()
        feeds.add(Feed(stories))
        feeds.add(Feed(Post(profile3,"Shodiyor", photo1)))
        feeds.add(Feed(Post(profile3,"Shodiyor", photo1)))
        feeds.add(Feed(Post(profile3,"Shodiyor", photo1)))
        feeds.add(Feed(Post(profile3,"Shodiyor", photo1)))
        feeds.add(Feed(Post(profile3,"Shodiyor", photo1)))
        feeds.add(Feed(Post(profile3,"Shodiyor", photo1)))
        feeds.add(Feed(Post(profile3,"Shodiyor", photo1)))
        feeds.add(Feed(Post(profile3,"Shodiyor", photo1)))
        feeds.add(Feed(Post(profile3,"Shodiyor", photo1)))

        return feeds;
    }

}