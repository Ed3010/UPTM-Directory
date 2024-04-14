package com.example.floorplans

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.floorplans.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    private val textViews = mutableListOf<TextView>()
    lateinit var binding: ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        textViews.add(binding.level5.cr510)
        textViews.add(binding.level5.cr59)
        textViews.add(binding.level5.cr523)
        textViews.add(binding.level5.cr511)
        textViews.add(binding.level5.cr512)
        textViews.add(binding.level5.cr522)
        textViews.add(binding.level5.cr524)
        textViews.add(binding.level5.lr52)
        textViews.add(binding.level11.library)
        textViews.add(binding.level11.labcbe)
        textViews.add(binding.grondFloor.LAB2)
        textViews.add(binding.grondFloor.lab1)
        textViews.add(binding.grondFloor.LAB3)
        textViews.add(binding.grondFloor.LAB4)
        textViews.add(binding.grondFloor.labImac)
        textViews.add(binding.grondFloor.makmal)
        textViews.add(binding.level11.prayerRoom)
        textViews.add(binding.level11.textView)
        textViews.add(binding.level11.bb2)
        textViews.add(binding.level11.bb1)
        textViews.add(binding.level11.textView12)
        textViews.add(binding.level11.textView14)
        textViews.add(binding.level11.fireexitbottom)
        textViews.add(binding.level2.kualit)
        textViews.add(binding.level2.KUALITI)
        textViews.add(binding.level2.IGS)
        textViews.add(binding.level2.SIMULASITaska)
        textViews.add(binding.level2.Kaunselar)
        textViews.add(binding.level2.BILIKSAKTI)
        textViews.add(binding.level2.Asad)
        textViews.add(binding.level2.Asad1)
        textViews.add(binding.level2.fireexit)
        textViews.add(binding.level2.stores)
        textViews.add(binding.level2.caessfs)
        textViews.add(binding.level2.dfs)
        textViews.add(binding.level2.stores)
        textViews.add(binding.level2.asad3)
        textViews.add(binding.level2.bilik)
        textViews.add(binding.level2.square)
        textViews.add(binding.level2.MPP)
        textViews.add(binding.level2.HEP)
        textViews.add(binding.level2.BilikMESYuaratMutiara)
        textViews.add(binding.level2.feha2)
        textViews.add(binding.level2.caesdf)
        textViews.add(binding.level2.dawam)
        textViews.add(binding.level2.lab12)
        textViews.add(binding.level2.caesdfd)
        textViews.add(binding.level2.caeddsdfs)
        textViews.add(binding.level2.caesdfddss)
        textViews.add(binding.level2.sfsf)
        textViews.add(binding.level2.feha2)
        textViews.add(binding.level2.fdf)
        textViews.add(binding.level3.fcom)
        textViews.add(binding.level3.mockTeaching)
        textViews.add(binding.level3.lt37)
        textViews.add(binding.level3.Cr35)
        textViews.add(binding.level3.fireExit)
        textViews.add(binding.level3.store)
        textViews.add(binding.level3.floorLift1)
        textViews.add(binding.level3.floorLift2)
        textViews.add(binding.level3.floorLift3)
        textViews.add(binding.level3.floorLift4)
        textViews.add(binding.level3.sfsf)
        textViews.add(binding.level3.workonstations)
        textViews.add(binding.level3.textView3)
        textViews.add(binding.level3.fireExit3)
        textViews.add(binding.level3.csfdsfsfs)
        textViews.add(binding.level3.csr1sfsfssfsf)
        textViews.add(binding.level3.csr1sfsfsf)
        textViews.add(binding.level3.csr1sfs)
        textViews.add(binding.level3.stor)
        textViews.add(binding.level3.csr5)
        textViews.add(binding.level3.csr4)
        textViews.add(binding.level3.csr1)
        textViews.add(binding.level4.dfs)
        textViews.add(binding.level4.dffsfss)
        textViews.add(binding.level4.dfsssf)
        textViews.add(binding.level4.dfsfsssfs)
        textViews.add(binding.level4.dfsfs23fs)
        textViews.add(binding.level4.dfsdfd)
        textViews.add(binding.level4.dfsfsas23fs)
        textViews.add(binding.level4.dfssfssfsf55fs)
        textViews.add(binding.level4.dsfsfsf2327s)
        textViews.add(binding.level4.dsfsf466sfs)
        textViews.add(binding.level4.dfssffdfdsf)
        textViews.add(binding.level4.dggsfsfs)
        textViews.add(binding.level4.dsfsafsfs)
        textViews.add(binding.level4.dfsfsfs)
        textViews.add(binding.level4.dfsfss)
        textViews.add(binding.level4.dsaffafafs)
        textViews.add(binding.level4.dfsfsfss)
        textViews.add(binding.level4.dsfsdfdf55fsfs)
        textViews.add(binding.level4.dsfsffs)
        textViews.add(binding.level4.dfssfsfs)
        textViews.add(binding.level4.dfssfrttsf)
        textViews.add(binding.level4.dsfsfs345454fs)
        textViews.add(binding.level4.dsfsfsafs)
        textViews.add(binding.level4.dsfss578788fsfsafs)
        textViews.add(binding.level4.dsfsfsdddvasfsfs)
        textViews.add(binding.level4.dsfsdfdfd56fsasfsfs)
        textViews.add(binding.level4.dssfaafsfsafs)
        textViews.add(binding.level4.dsfsfsfgyyfsfsafs)
        textViews.add(binding.level4.dsfsssfyysafs)
        textViews.add(binding.level4.dsfsfsfrrssafs)
        textViews.add(binding.level4.dsfssfsfseeafs)
        textViews.add(binding.level4.sfsdsfsfsafs)
        textViews.add(binding.level4.dsfsqqsfsfsafs)
        textViews.add(binding.level4.dsfsssuusfsafs)
        textViews.add(binding.level4.dsfsfsfsafs)
        textViews.add(binding.level4.dsfsfuytrsfssafs)
        textViews.add(binding.level4.dsfsfssfsddddfdafs)
        textViews.add(binding.level4.dsfsfsaaadfs)
        textViews.add(binding.level4.dsfsssfopopsafs)
        textViews.add(binding.level4.dsfsssfsuiopafs)
        textViews.add(binding.level5.fabasu)
        textViews.add(binding.level5.fabasu1)
        textViews.add(binding.level5.toilet1)
        textViews.add(binding.level5.toilet2)
        textViews.add(binding.level5.store)
        textViews.add(binding.level5.fireexit)
        textViews.add(binding.level5.store1)
        textViews.add(binding.level5.store2)
        textViews.add(binding.level5.store3)
        textViews.add(binding.level5.fire2)
        textViews.add(binding.level5.ips)
        textViews.add(binding.level5.floorLift1)
        textViews.add(binding.level5.floorLift2)
        textViews.add(binding.level5.lr52)
        textViews.add(binding.level5.tah)
        textViews.add(binding.level5.cr56)
        textViews.add(binding.level5.cr57)
        textViews.add(binding.level5.cr58)
        textViews.add(binding.level5.cr59)
        textViews.add(binding.level5.cr510)
        textViews.add(binding.level5.cr511)
        textViews.add(binding.level5.cr524)
        textViews.add(binding.level5.cr522)
        textViews.add(binding.level5.cr523)
        textViews.add(binding.level5.cr21)
        textViews.add(binding.level5.cr520)
        textViews.add(binding.level5.cr519)
        textViews.add(binding.level5.cr513)
        textViews.add(binding.level5.cr14)
        textViews.add(binding.level5.cr515)
        textViews.add(binding.level5.cr16)
        textViews.add(binding.level5.cr517)
        textViews.add(binding.level5.cr518)
        textViews.add(binding.level5.frres)
        textViews.add(binding.level5.lr54)
        textViews.add(binding.level5.fssabasu)
        textViews.add(binding.level5.lift44)
        textViews.add(binding.level5.lift33)
        textViews.add(binding.level5.storesss)
        textViews.add(binding.level5.cr525)
        textViews.add(binding.level5.labcisbo)


        binding.level5.cr59.setOnClickListener {
            goToNext("cr59")
        }
        binding.level5.cr510.setOnClickListener {
            goToNext("cr510")
        }
        binding.level5.cr511.setOnClickListener {
            goToNext("cr511")
        }
        binding.level5.cr512.setOnClickListener {
            goToNext("cr512")
        }
        binding.level5.cr522.setOnClickListener {
            goToNext("cr522")
        }
        binding.level5.cr523.setOnClickListener {
            goToNext("cr523")
        }
        binding.level5.cr524.setOnClickListener {
            goToNext("cr524")
        }
        binding.level5.lr52.setOnClickListener {
            goToNext("lr52")
        }
        binding.level11.labcbe.setOnClickListener {
            goToNext("labcbe")
        }


        binding.btnSearch.setOnClickListener {
            searchAndMark(binding.editTextText.text.toString())
        }
        binding.btnHelp.setOnClickListener{
                val intents = Intent(this@SearchActivity, TuturialActivity::class.java)
                startActivity(intents)
        }

    }

    private fun searchAndMark(searchString: String) {
        textViews.forEach { textView ->
            if (textView.text.contains(searchString, ignoreCase = true)) {
                // Highlight the TextView
                textView.setCompoundDrawablesWithIntrinsicBounds(
                    0,
                    R.drawable.location, // Assuming R.drawable.location is the search icon
                    0,
                    0
                )
            } else {
                // Reset drawable and background for TextView
                textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0)
                textView.setBackgroundResource(R.drawable.rec)
            }
        }
    }

    fun goToNext(vaule: String) {
        val intents = Intent(this@SearchActivity, ViewScheduleActivity::class.java)
        intents.putExtra("type", vaule)
        startActivity(intents)

    }
}