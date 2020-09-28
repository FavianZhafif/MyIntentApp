package com.dicoding.picodiploma.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_move_for_result.*

class MoveForResultActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnChoose: Button
    private lateinit var rg_artist: RadioGroup

    companion object {
        const val EXTRA_SELECTED_VALUE = "extra_selected_value"
        const val RESULT_CODE = 110
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result)

        btnChoose = findViewById(R.id.btn_choose)
        rg_artist = findViewById(R.id.rg_artist)

        btnChoose.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_choose) {
            if (rg_artist.checkedRadioButtonId !=0) {
                var value = toString()
                when (rg_artist.checkedRadioButtonId) {
                    R.id.rb_Nasya_Marcella -> value = "Nasya Marcella"

                    R.id.rb_Yasmin_Napper -> value = "Yasmin Napper"

                    R.id.rb_Caitlin_Halderman -> value = "Caitlin Halderman"

                    R.id.rb_Natasha_Wilona -> value = "Natasha Wilona"
                }

                val resultIntent = Intent()
                resultIntent.putExtra(EXTRA_SELECTED_VALUE, value)
                setResult(RESULT_CODE, resultIntent)
                finish()
            }
        }
    }
}
