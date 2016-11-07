package com.androidyuan.ccalljava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.androidyuan.tool.JavaCallC;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toast(JavaCallC.getString());


        JavaCallC.setStreamListener(new OnStreamLiStener() {
            @Override
            public void onConnected() {
                Log.d(getTag(),"onConnected()");
            }

            @Override
            public void onReconnected(int second) {
                Log.d(getTag(),"onReconnected("+second+")");
            }
        });
    }

    private void toast(String str) {
        Toast.makeText(this,str+"",Toast.LENGTH_SHORT).show();
    }


    private String getTag(){
        return getClass().getSimpleName().toString();
    }

    public interface  OnStreamLiStener
    {

        void onConnected();

        void onReconnected(int second);
    }

}
