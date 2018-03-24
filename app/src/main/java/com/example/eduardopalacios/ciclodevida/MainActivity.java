package com.example.eduardopalacios.ciclodevida;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
//
    Toolbar toolbar;
    TextInputLayout nombre;
    Button aceptar;
    Context context=this;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplication(),"on Create",Toast.LENGTH_LONG).show();
        nombre=(TextInputLayout)findViewById(R.id.text_input_layout_nombre);
        aceptar=(Button)findViewById(R.id.aceptar);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Formulario");
        toolbar.setTitleTextColor(Color.parseColor("#ffffffff"));
        setSupportActionBar(toolbar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(view);
                Dialog dialog=new Dialog(context);
                dialog.Dialogolayout();

                Log.d("tag",nombre.getEditText().getText().toString());
            }
        });

    }

    public void validate(View view) {
        String mailError = null;
        if (nombre.getEditText().length()>=10||nombre.getEditText().length()==0) {
            mailError = "error";
        }
        toggleTextInputLayoutError(nombre, mailError);




       nombre.clearFocus();
    }


    public void toggleTextInputLayoutError(TextInputLayout textInputLayout,String msg) {
        textInputLayout.setError(msg);
        if (msg == null) {
            textInputLayout.setErrorEnabled(false);
        } else {
            textInputLayout.setErrorEnabled(true);
        }
    }


    @Override
    protected void onStart() {

        Toast.makeText(getApplicationContext(),"onStart",Toast.LENGTH_SHORT).show();
        super.onStart();
    }

    @Override
    protected void onResume() {
        Toast.makeText(getApplicationContext(),"onResume",Toast.LENGTH_SHORT).show();
        super.onResume();
    }

    @Override
    protected void onPause() {
        Toast.makeText(getApplicationContext(),"onPause",Toast.LENGTH_SHORT).show();
        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(getApplicationContext(),"onStop",Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(getApplicationContext(),"onDestroy",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(getApplicationContext(),"onRestart",Toast.LENGTH_SHORT).show();
        super.onRestart();
    }



}




