package sg.edu.rp.c346.id19020844.demoimageview;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // declare the ImageView object called ivDay2
    ImageView ivDay2, ivDay3, ivDay4, ivDay5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get the ImageView obj and assign to ivDay2
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        ivDay3 = (ImageView) findViewById(R.id.imageView3);
        ivDay4 = (ImageView) findViewById(R.id.imageView4);
        ivDay5 = (ImageView) findViewById(R.id.imageView5);
        // set the image
        ivDay2.setImageResource(R.drawable.day2);
        ivDay3.setImageResource(R.drawable.day3);
        ivDay4.setImageResource(R.drawable.day4);
        ivDay5.setImageResource(R.drawable.day5);
    }
}