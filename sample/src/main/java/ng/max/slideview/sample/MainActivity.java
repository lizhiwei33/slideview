package ng.max.slideview.sample;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import ng.max.slideview.SlideView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((SlideView) findViewById(R.id.slider5)).setOnSlideCompleteListener(new SlideView.OnSlideCompleteListener() {
            @Override
            public void onSlideComplete(SlideView slideView) {
                Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(500);
                //slideView.setEnabled(false);
                ///
                slideView.setText("Disabled");
            }
        });
       // (SlideView)findViewById(R.id.slider1).setonSli
        ((SlideView)findViewById(R.id.slider1)).setOnSlideCompleteListener(new SlideView.OnSlideCompleteListener(){

            @Override
            public void onSlideComplete(SlideView slideView) {
                Toast.makeText(MainActivity.this,"tishi",Toast.LENGTH_LONG).show();
            }
        });
    }
}
