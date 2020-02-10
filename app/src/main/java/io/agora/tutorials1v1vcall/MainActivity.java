package io.agora.tutorials1v1vcall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }
    public void speak(View view)
    {
        Intent intent = new Intent(MainActivity.this, VideoChatViewActivity.class);
        startActivity(intent);
    }
}
