package com.simtrayclub.avatarkorracharacters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.simtrayclub.avatarkorracharacters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.toolbar.title= "  Characters"
        binding.toolbar.setLogo(R.drawable.wind_logo_36)

        setSupportActionBar(binding.toolbar)

        //val navHostFragment =
          //  supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment


    }
}