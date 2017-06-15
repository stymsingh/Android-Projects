package com.example.satyam.cookies;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
         ImageView image = (ImageView) findViewById(R.id.android_cookie_image_view);
         image.setImageResource(R.drawable.after_cookie);
         TextView txt = (TextView) findViewById(R.id.status_text_view);
         txt.setText("I'm so full");



    }
}
