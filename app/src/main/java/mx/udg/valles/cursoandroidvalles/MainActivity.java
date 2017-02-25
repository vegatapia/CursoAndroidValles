package mx.udg.valles.cursoandroidvalles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Estoy en OnCreate();");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "Estoy en OnStart();");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "Estoy en OnStop();");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "Estoy en OnDestroy();");
    }
}
