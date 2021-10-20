package learn.idn.doa__dzikir_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HarianDzikirDoaActivity : AppCompatActivity() {

    //data yg kosong di tampilakn terlebih dahulu
    private val listHarianDzikir: ArrayList<DzikirDoa> = arrayListOf()

    //data yg diarsipkan telebih dahulu
//    private lateinit var listHarianDzikir: ArrayList<DzikirDoa>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_harian_dzikir_doa)

        initData()
        initView()

    }

    private fun initView() {
        val rvHarianDzikirDoaActivity = findViewById<RecyclerView>(R.id.rv_harian_dzikir_doa)
        rvHarianDzikirDoaActivity.layoutManager = LinearLayoutManager(this)
        rvHarianDzikirDoaActivity.adapter = DzikirDoaAdaptor(listHarianDzikir)
    }

    private fun initData() {
        val descHarianDzikir = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafazHarianDzikir = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val terjemahHarianDzikir = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        for (data in descHarianDzikir.indices) {
            val list = DzikirDoa(
                descHarianDzikir[data],
                lafazHarianDzikir[data],
                terjemahHarianDzikir[data]
            )
            listHarianDzikir.add(list)
        }
    }

}