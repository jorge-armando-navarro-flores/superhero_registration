package com.example.registrodesuperheroes

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.registrodesuperheroes.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        const val SUPERHERO_KEY = "superhero"
        const val BITMAP_KEY = "bitmap"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!
        val superhero = bundle.getParcelable<Superhero>(SUPERHERO_KEY)!!
        val bitmapDirectory = bundle.getString(BITMAP_KEY)!!
        val bitmap = BitmapFactory.decodeFile(bitmapDirectory)

        binding.detailImageView.setImageBitmap(bitmap)
        binding.superhero = superhero
    }
}