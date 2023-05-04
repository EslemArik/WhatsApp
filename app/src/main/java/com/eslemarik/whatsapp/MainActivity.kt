package com.eslemarik.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val k1 = Bilgiler("https://i.redd.it/vh04fcg5dlh01.jpg", "Süleyman BİLGİN","Merhaba")
        val k2 = Bilgiler("https://i.redd.it/vh04fcg5dlh01.jpg","Ece YANARDAĞ","Hello")
        val k3 = Bilgiler("https://i.redd.it/vh04fcg5dlh01.jpg","Enes ARIK","Selam")

        val dizi: ArrayList<Bilgiler> = ArrayList()
        dizi.add(k1)
        dizi.add(k2)
        dizi.add(k3)



    }
}