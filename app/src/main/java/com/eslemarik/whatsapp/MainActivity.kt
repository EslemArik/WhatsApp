package com.eslemarik.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val k1 = Bilgiler("https://lh6.ggpht.com/9SZhHdv4URtBzRmXpnWxZcYhkgTQurFuuQ8OR7WZ3R7fyTmha77dYkVvcuqMu3DLvMQ=w300", "Süleyman BİLGİN","Merhaba")
        val k2 = Bilgiler("https://lh6.ggpht.com/9SZhHdv4URtBzRmXpnWxZcYhkgTQurFuuQ8OR7WZ3R7fyTmha77dYkVvcuqMu3DLvMQ=w300","Ece YANARDAĞ","Hello")
        val k3 = Bilgiler("https://lh6.ggpht.com/9SZhHdv4URtBzRmXpnWxZcYhkgTQurFuuQ8OR7WZ3R7fyTmha77dYkVvcuqMu3DLvMQ=w300","Enes ARIK","Selam")

        val dizi: ArrayList<Bilgiler> = ArrayList()
        dizi.add(k1)
        dizi.add(k2)
        dizi.add(k3)

        val rvBG: RecyclerView = findViewById(R.id.rv_bilgiler)
        val layoutManager = LinearLayoutManager(this.baseContext)
        rvBG.layoutManager = layoutManager
        rvBG.adapter = BilgilerAdapter(dizi,this)


    }
}
