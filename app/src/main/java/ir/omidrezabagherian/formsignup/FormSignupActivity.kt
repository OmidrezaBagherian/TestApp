package ir.omidrezabagherian.formsignup

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormSignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_signup)
        val name = findViewById<EditText>(R.id.edittext_signup_name)
        val family = findViewById<EditText>(R.id.edittext_signup_family)
        val nationalCode = findViewById<EditText>(R.id.edittext_signup_nationalCode)
        val fatherName = findViewById<EditText>(R.id.edittext_signup_fatherName)
        val birthYear = findViewById<EditText>(R.id.edittext_signup_birthYear)
        val sendValue = findViewById<Button>(R.id.button_signup_sendValue)

        sendValue.setOnClickListener {
            if (name.text.toString() == "") Toast.makeText(this, "نام اشتباه وارد شده", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, name.text.toString(), Toast.LENGTH_SHORT).show()
            if (family.text.toString() == "") Toast.makeText(this, "نام خانوادگی اشتباه وارد شده", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, family.text.toString(), Toast.LENGTH_SHORT).show()
            if (nationalCode.text.toString() == "") Toast.makeText(this, "کدملی اشتباه وارد شده", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, nationalCode.text.toString(), Toast.LENGTH_SHORT).show()
            if (fatherName.text.toString() == "") Toast.makeText(this, "نام پدر اشتباه وارد شده", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, fatherName.text.toString(), Toast.LENGTH_SHORT).show()
            if (birthYear.text.toString() == "") Toast.makeText(this, "سال تولد اشتباه وارد شده", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, birthYear.text.toString(), Toast.LENGTH_SHORT).show()
        }
    }

}