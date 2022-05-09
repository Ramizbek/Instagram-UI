package ramizbek.aliyev.instagramui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val secondFragment = SecondFragment()
        val homeFragment = HomeFragment()
        val fragmentManager = supportFragmentManager

        fragmentManager.beginTransaction().add(R.id.my_container,homeFragment).commit()

        home.setOnClickListener {
        fragmentManager.beginTransaction().replace(R.id.my_container ,secondFragment).commit()
    }
        My_profile.setOnClickListener {
            fragmentManager.beginTransaction().replace(R.id.my_container , homeFragment).commit()
        }




        }
    }