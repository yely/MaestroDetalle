package com.example.yely.maestrodetalle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Definimos el ListView
    private ListView listView;
    //Elementos que se mostraran en el listview
    private String lenguajeProgramacion[]=new String[]{"http://api.kivaws.org/v1/lenders/jeremy/loans.json","equipos","más reciente","búsqueda","reciente","préstamos equipos",
            "préstamos más reciente","préstamos búsqueda","métodos","socios"};
    //Array de las imagenes



    private String lenguajeProgramacion[]=new String[]{"http://api.kivaws.org/v1/lenders/jeremy/teams.json","http://api.kivaws.org/v1/lenders/newest.json","http://api.kivaws.org/v1/lenders/search.json","http://api.kivaws.org/v1/lending_actions/recent.json","http://api.kivaws.org/v1/loans/613086/teams.json","http://api.kivaws.org/v1/loans/newest.json",
            "http://api.kivaws.org/v1/loans/search.json","http://api.kivaws.org/v1/methods.json","http://api.kivaws.org/v1/partners.json"};

    private int[] LogoId = new int[]{R.drawable.java, R.drawable.php,
            R.drawable.python,R.drawable.javascript,
            R.drawable.ruby, R.drawable.c,R.drawable.go,
            R.drawable.perl,R.drawable.pascal};


}
