package com.sandra.spinnertaller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.idspinner);
        spinner();
    }
    void spinner(){

        List list = new ArrayList();

        list.add("Seleccione una opcion...");
        list.add("Electrohogar");
        list.add("Tecnología");
        list.add("Moda Hombre");
        list.add("Moda Mujer");
        list.add("Infantil");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l){
                switch (i){
                    case 0:
                        break;

                    case 1:
                        Intent elec = new Intent(MainActivity.this, Activity2.class);
                        startActivity(elec);
                        break;

                    case 2:
                        Intent tec = new Intent(MainActivity.this, Activity3.class);
                        startActivity(tec);
                        break;

                    case 3:
                        Intent mh = new Intent(MainActivity.this, Activity4.class);
                        startActivity(mh);
                        break;

                    case 4:
                        Intent mm = new Intent(MainActivity.this, Activity5.class);
                        startActivity(mm);
                        break;

                    case 5:
                        Intent inf = new Intent(MainActivity.this, Activity6.class);
                        startActivity(inf);
                        break;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView){
                Toast.makeText(MainActivity.this, "no hace nada", Toast.LENGTH_SHORT).show();
            }

        });
    }
}



