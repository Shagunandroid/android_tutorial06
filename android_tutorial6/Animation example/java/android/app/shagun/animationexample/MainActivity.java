package android.app.shagun.animationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation fade_in_fade_out,slide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fade_in_fade_out = AnimationUtils.loadAnimation(this , R.anim.fade_in_fade_out); //Int.. of fade .. anim
        slide = AnimationUtils.loadAnimation(this , R.anim.slide); //Int.. of slide anim
        TextView hello_world = (TextView)findViewById(R.id.helloworld); //Int.. of text view
        hello_world.setAnimation(slide);
    }
}
