package com.hercudev.zeku.ciclodevida;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String LOGTAG = MainActivity.class.getSimpleName();
    Context ctx = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast t = Toast.makeText(ctx, getString(R.string.oncreate), Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
        Log.i(LOGTAG, getString(R.string.oncreate));
    }

    @Override
    public void onStart(){
        super.onStart();

        Toast t = Toast.makeText(ctx, getString(R.string.onstart), Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,20);
        t.show();
        Log.i(LOGTAG, getString(R.string.onstart));

    }

    @Override
    public void onResume(){
        super.onResume();

        Toast t = Toast.makeText(ctx, getString(R.string.onresume),Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,40);
        t.show();

        Log.i(LOGTAG, getString(R.string.onresume));

    }

    @Override
    public void onPause(){
        super.onPause();

        Toast t = Toast.makeText(ctx, getString(R.string.onpause), Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,20);
        t.show();
        Log.i(LOGTAG, getString(R.string.onpause));

    }

    @Override
    public void onStop() {
        super.onStop();

        Toast t = Toast.makeText(ctx, getString(R.string.onstop), Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,40);
        t.show();
        Log.i(LOGTAG, getString(R.string.onstop));

    }

    @Override
    public void onRestart(){
        super.onRestart();

        Toast t = Toast.makeText(ctx, getString(R.string.onrestart), Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();

        Log.i(LOGTAG, getString(R.string.onrestart));

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast t = Toast.makeText(ctx, getString(R.string.ondestroy), Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER,0,60);
        t.show();
        Log.i(LOGTAG, getString(R.string.ondestroy));

    }


}
