package com.example.eduardopalacios.ciclodevida;

import android.annotation.SuppressLint;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

/**
 * Created by eduardopalacios on 09/03/18.
 */

public class Dialog {

    Context context;
    //int[][] states = new int[][] {
      //      new int[] { android.R.attr.state_enabled},

    //};

    //int[] colors = new int[] {
      //      Color.parseColor("#ccf20b49")
    //};


    public Dialog(Context context)
    {
        this.context=context;
    }

    public void Dialogsimple()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle("Titulo")
                .setMessage("El Mensaje para el usuario")
                .setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        })
                .setNegativeButton("CANCELAR",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });

        AlertDialog dialog = builder.create();
        dialog.show();


    }

    public void Dialoglista()
    {
        final String []items={"opcion1","opcion2","opcion3"};
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle("Lista").setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(context,items[i],Toast.LENGTH_SHORT).
                        show();

            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public  void Dialogolayout()
    {
       //
        // ColorStateList myList = new ColorStateList(states, colors);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.layoutdialog, null);


        final CheckBox checkBox=(CheckBox)v.findViewById(R.id.recordarme);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked())
                {
                    Toast.makeText(context,"correcto",Toast.LENGTH_SHORT).
                            show();
                }
            }
        });
        Button cancelar=(Button)v.findViewById(R.id.cancelar);
        //
        // setButtonTint(cancelar,myList);

        Button aceptar=(Button)v.findViewById(R.id.aceptar);
        //
        // setButtonTint(aceptar,myList);

        builder.setView(v);

        final AlertDialog dialog = builder.create();

        cancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             dialog.cancel();
            }
        });

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        dialog.show();



    }


    //@SuppressLint("RestrictedApi")
    //public static void setButtonTint(Button button, ColorStateList tint) {
      //  if (Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP && button instanceof AppCompatButton) {
        //    ((AppCompatButton) button).setSupportBackgroundTintList(tint);
        //} else {
          //  ViewCompat.setBackgroundTintList(button, tint);
        //}
    //}
}
