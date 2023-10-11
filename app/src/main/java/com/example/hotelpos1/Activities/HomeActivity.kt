package com.example.hotelpos1.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelpos1.databinding.ActivityHomeBinding
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentContainer
import com.example.hotelpos1.Fragments.AddProductCategory
import com.example.hotelpos1.R
import com.google.android.material.navigation.NavigationView

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var toolbar: Toolbar
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var fragmentContainer: FragmentContainer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)

     //  setOnClickListener()
        val view = binding.root
        setContentView(view)

      //  val navView: NavigationView = binding.navView
        toolbar = binding.myToolbar
        drawerLayout = binding.drawerLayout

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

     /*   navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.Home -> showToast("Click Home")

                R.id.ProductManager -> {
                    showToast("Click Product Manager")
                }

                R.id.ProductCategory -> {
                }

                R.id.AddProduct -> showToast("Click Add Product")
                R.id.AllProduct -> showToast("Click All Product")
                R.id.AdminManager -> showToast("Click Admin Manager")
                R.id.NewUser -> showToast("Click New User")
                R.id.AllStaffs -> showToast("Click All Staffs")
                R.id.Booking -> showToast("Click Booking")
                R.id.AddTables -> showToast("Click Add Tables")
                R.id.BookTable -> showToast("Click Book Tables")
                R.id.OutsideBooking -> showToast("Click Outside Booking")
                R.id.BookingHistory -> showToast("Click Booking History")
                R.id.LogOut -> showToast("Click LogOut")
            }
            true
        }*/

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

   private fun setOnClickListener(){

        binding.navView   .setOnClickListener {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,AddProductCategory()).addToBackStack("").commit()
        }

    }


   /* private fun showToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
*/

}
