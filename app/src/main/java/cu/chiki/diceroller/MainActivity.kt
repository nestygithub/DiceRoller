package cu.chiki.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var resultImageView1:ImageView
    lateinit var resultImageView2:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultImageView1 = findViewById(R.id.result_image1)
        resultImageView2 = findViewById(R.id.result_image2)
        val rollButton = findViewById<Button>(R.id.roll_button)
        rollButton.text = getString(R.string.lets_roll)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val result1 = Random.nextInt(6)+1
        val result2 = Random.nextInt(6)+1
        resultImageView1.setImageResource(when(result1){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else->R.drawable.dice_1
        })
        resultImageView2.setImageResource(when(result2){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else->R.drawable.dice_1
        })
    }

}