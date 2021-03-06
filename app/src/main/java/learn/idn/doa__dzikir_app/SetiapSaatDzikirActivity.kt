package learn.idn.doa__dzikir_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SetiapSaatDzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setiap_saat_dzikir)

        val rvSetiapSaatDzikirActivity = findViewById<RecyclerView>(R.id.rv_setiap_saat_dzikir)
        rvSetiapSaatDzikirActivity.layoutManager = LinearLayoutManager(this)
        rvSetiapSaatDzikirActivity.adapter = DzikirDoaAdaptor(DataDzikirDoa.listQouliyahShalatActivity)
    }
}