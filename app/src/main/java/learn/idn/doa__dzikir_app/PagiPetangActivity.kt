package learn.idn.doa__dzikir_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PagiPetangActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var cvDzikirPagi: CardView
    private lateinit var cvDzikirPetang: CardView
    private lateinit var btnvDzikirPagi: ImageButton
    private lateinit var btnDzikirPetang: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagi_petang)

        cvDzikirPagi = findViewById(R.id.cv_pagi)
        cvDzikirPagi.setOnClickListener(this)
        cvDzikirPetang = findViewById(R.id.materialCardView)
        cvDzikirPetang.setOnClickListener(this)

        btnvDzikirPagi = findViewById(R.id.img_btn_dzikir_pagi)
        btnvDzikirPagi.setOnClickListener(this)
        btnDzikirPetang = findViewById(R.id.img_btn_dzikir_petang)
        btnDzikirPetang.setOnClickListener(this)

    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.cv_pagi -> startActivity(Intent(this, DzikirPagiActivity::class.java))
            R.id.img_btn_dzikir_pagi -> startActivity(Intent(this, DzikirPagiActivity::class.java))

            R.id.cv_dzikir_petang -> startActivity(Intent(this, DzikirPetangActivity::class.java))
            R.id.img_btn_dzikir_petang -> startActivity(Intent(this, DzikirPetangActivity::class.java))
        }
    }


}