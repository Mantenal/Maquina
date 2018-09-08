package maquina.maquina;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Login extends AppCompatActivity {
    Button Registro,Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Login=findViewById(R.id.B_ingresar_L);
        Registro=findViewById(R.id.B_registro_L);

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent main= new Intent(getApplicationContext(),Main.class);
                startActivity(main);
            }
        });

        Registro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent reg= new Intent(getApplicationContext(),Registro.class);
                startActivity(reg);
            }
        });

    }




}
