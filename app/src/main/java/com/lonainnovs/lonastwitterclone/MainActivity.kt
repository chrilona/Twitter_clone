package com.lonainnovs.lonastwitterclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.lonainnovs.lonastwitterclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        tweetDisplays()
    }
    fun tweetDisplays(){
        var tweet1 = Tweet("","","3","lona@christabelalonaguru","Have " +
                "you had your cup today","","","34","","90",
        "")
        var tweet2 = Tweet("","","4","virgy@krystals","Iam unstoppable",
        "","","23","","56",""
            )
        var tweet3= Tweet("","","44","wanda@liaslisa","Ever thought of being a programmer","",
        "","12","","1120",""
            )

        var listTweets = listOf<Tweet>(tweet1, tweet2,tweet3)
        var tweetAdapter = TweetsAdapter(listTweets)
        binding.rvTweets.layoutManager = LinearLayoutManager(this)
        binding.rvTweets.adapter = tweetAdapter
    }
}
