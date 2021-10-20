package learn.idn.doa__dzikir_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class QouliyahShalatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qouliyah_shalat)

        val rvQouliyahShalatActivity = findViewById<RecyclerView>(R.id.rv_qouliyah_shalat)
        rvQouliyahShalatActivity.layoutManager = LinearLayoutManager(this)
        rvQouliyahShalatActivity.adapter = DzikirDoaAdaptor(DataDzikirDoa.listQouliyahShalatActivity)
    }
}