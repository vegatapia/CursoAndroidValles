package mx.udg.valles.cursoandroidvalles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.usernameEditText);
        password = (EditText)findViewById(R.id.passwordEditText);

        Button login = (Button)findViewById(R.id.LoginButton);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (passValidation()){
                    checkCredenciales();
                }
            }
        });

        Log.d("MainActivity", "Estoy en OnCreate();");

    }

    private boolean checkCredenciales() {
        return false;


    }

    private boolean passValidation() {

        boolean passValidation = true;
        username.setError(null);
        password.setError(null);

        String usernameText = username.getText().toString();
        if(usernameText.length()==0){
            username.setError("Usuario no puede estar vacio");
            passValidation = false;
        }

        String passwordText = password.getText().toString();
        if(passwordText.length()==0){
            password.setError("Password no puede estar vacio");
            passValidation = false;
        }

        return passValidation;
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
