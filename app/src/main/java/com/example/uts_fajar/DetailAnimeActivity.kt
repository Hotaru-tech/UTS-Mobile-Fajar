package com.example.uts_fajar

import android.net.Uri
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class DetailAnimeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_anime)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val anime = intent.getParcelableExtra<Anime>(MainActivity.INTENT_PARCELABLE)

        val imganime = findViewById<ImageView>(R.id.img_item_photo)
        val nameanime = findViewById<TextView>(R.id.tv_item_name)
        val descanime = findViewById<TextView>(R.id.tv_item_description)
        val videoView = findViewById<VideoView>(R.id.video_view)
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.trailer1)



        imganime.setImageResource(anime?.imganime!!)
        nameanime.text = anime.nameanime
        descanime.text = anime.descanime
        videoView.setVideoURI(uri)
        videoView.setOnCompletionListener {
            videoView.start()
        }
        videoView.start()
        val checkboxFavorite = findViewById<CheckBox>(R.id.checkbox_favorite)

        checkboxFavorite.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // checkbox dicentang, tambahkan ke daftar favorit
                addToFavorites()
            } else {
                // checkbox tidak dicentang, hapus dari daftar favorit
                removeFromFavorites()
            }
        }
    }

    private fun addToFavorites() {
        // tambahkan item ke daftar favorit
        // implementasi tambahkan item ke daftar favorit
    }

    private fun removeFromFavorites() {
        // hapus item dari daftar favorit
        // implementasi hapus item dari daftar favorit
    }

    override fun onSupportNavigateUp(): Boolean {

        onBackPressed()
        return true
    }
}
