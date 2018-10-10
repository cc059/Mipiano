package sv.edu.catolica.mipiano;

import android.content.pm.ActivityInfo;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnA,btnB,btnC, btnD,btnE,btnF,btnG,btnH, btnI,btnJ;
    private SoundPool sound;
    private int soundA,soundB,soundC,soundD,soundE,soundF,soundG,soundH,soundI,soundJ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        btnA=(Button)findViewById(R.id.btn1);
        btnB=(Button)findViewById(R.id.btn2);
        btnC=(Button)findViewById(R.id.btn3);
        btnD=(Button)findViewById(R.id.btn4);
        btnE=(Button)findViewById(R.id.btn5);
        btnF=(Button)findViewById(R.id.btn6);
        btnG=(Button)findViewById(R.id.btn7);
        btnH=(Button)findViewById(R.id.btn8);
        btnI=(Button)findViewById(R.id.btn9);
        btnJ=(Button)findViewById(R.id.btn35);

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            sound=new SoundPool.Builder().setMaxStreams(5).build();
        }
        else
        {
            sound=new SoundPool(5, AudioManager.STREAM_MUSIC,0);
        }
        soundA=sound.load(this,R.raw.dog,1);
        soundB=sound.load(this,R.raw.cordero,1);
        soundC=sound.load(this,R.raw.burrito,1);
        soundD=sound.load(this,R.raw.elefante,1);
        soundE=sound.load(this,R.raw.horse,1);
        soundF=sound.load(this,R.raw.lobo,1);
        soundG=sound.load(this,R.raw.leon,1);
        soundH=sound.load(this,R.raw.mono,1);
        soundI=sound.load(this,R.raw.gato,1);
        soundJ=sound.load(this,R.raw.pajaro,1);
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.play(soundA,1,1,0,0,1);
            }
        });
        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.play(soundB,1,1,0,0,1);
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.play(soundC,1,1,0,0,1);
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.play(soundD,1,1,0,0,1);
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.play(soundE,1,1,0,0,1);
            }
        });
        btnF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.play(soundF,1,1,0,0,1);
            }
        });
        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.play(soundG,1,1,0,0,1);
            }
        });
        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.play(soundH,1,1,0,0,1);
            }
        });
        btnI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.play(soundI,1,1,0,0,1);
            }
        });
        btnJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sound.play(soundJ,1,1,0,0,1);
            }
        });
    }
}
