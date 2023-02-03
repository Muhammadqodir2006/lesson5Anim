package uz.itschool.lesson5anim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var im = 1
    var img:Int = R.drawable.img1
    private lateinit var animation : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image.setOnClickListener{
            if (im == 1){
                im = 2
                img = R.drawable.img2
            }else{
                im = 1
                img = R.drawable.img1
            }
            animation = AnimationUtils.loadAnimation(applicationContext, R.anim.an1)
            image.startAnimation(animation)
            animation.setAnimationListener(object : Animation.AnimationListener{
                override fun onAnimationStart(animation: Animation?) {

                }

                override fun onAnimationEnd(anim: Animation?) {
                    animation = AnimationUtils.loadAnimation(applicationContext, R.anim.an2)
                    image.setImageResource(img)
                    image.startAnimation(animation)
                }

                override fun onAnimationRepeat(animation: Animation?) {
                }

            })

        }
    }
}