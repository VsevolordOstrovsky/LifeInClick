package com.example.asdfgh;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    private Button btn;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AAAAAA","onCreate");
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);

        btn.setOnClickListener(view -> {
            count++;
            tv.setText(Integer.toString(count));
        });
//ewfwef
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value",count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt("value");
        tv.setText(Integer.toString(count));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAAAAA","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAAAAA","onDestroy");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAAAAA","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAAAAA","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAAAAA","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAAAAA","onStop");
    }

}