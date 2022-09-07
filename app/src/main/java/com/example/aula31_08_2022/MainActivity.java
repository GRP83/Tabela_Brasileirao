package com.example.aula31_08_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    String [] de = {"img","pg","j","v", "e","d","gp","gc","sg","ap"};
    int [] para = {R.id.imgtime, R.id.txtpg, R.id.txtj, R.id.txtv,R.id.txte, R.id.txtd, R.id.txtgp, R.id.txtgc, R.id.txtsg, R.id.txtap };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        String[] clubes = {"Atletico-MG","Palmeiras","Flamengo","Fortaleza","Red Bull Bragantino","Corinthians","Internacional","Fluminense","Cuiaba","Atletico","Atletico-GO","Sao Paulo","Ceara","Santos","Bahia","Juventude","Gremio","America-MG","Sport","Chapecoense"};

        int[] img = {R.drawable.cam,R.drawable.pal,R.drawable.fla,R.drawable.fort,R.drawable.rbr,R.drawable.cor,R.drawable.inter,R.drawable.flu,R.drawable.cui,R.drawable.cap,R.drawable.ago,R.drawable.sao,R.drawable.cea,R.drawable.san,R.drawable.bah,R.drawable.juv,R.drawable.gre,R.drawable.ame,R.drawable.spt,R.drawable.cha};
        int[] PG= {45,38,34,33,33,30,29,29,28,27,26,25,25,24,23,23,22,22,17,10};
        int[] J= {20,20,18,21,20,21,20,21,21,20,20,20,20,21,21,21,19,20,21,21};
        int[] V= {14,12,11,9,8,7,7,7,6,8,6,6,5,5,6,5,6,5,3,1};
        int[] E= {3,2,1,6,9,9,8,8,10,3,8,7,10,9,5,8,4,7,8,7};
        int[] D= {3,6,6,6,3,5,5,6,5,9,6,7,5,7,10,8,9,8,10,13};
        int[] GP= {32,32,35,29,31,20,24,22,23,25,17,18,19,20,25,18,15,18,8,17};
        int[] GC= {13,23,18,23,22,18,22,23,22,24,20,23,21,25,33,25,18,23,18,34};
        int[] SG= {19,9,17,6,9,2,2,-1,1,1,-3,-5,-2,-5,-8,-7,-3,-5,-10,-17};
        int[] AP= {75,63,63,52,55,48,48,46,44,45,43,42,42,38,37,37,39,37,27,16};


        List<HashMap<String, Object>> lista = new ArrayList<>();
        HashMap<String, Object> item;
        for (int i = 0; i < clubes.length; i++) {
            item = new HashMap<>();
            item.put(de[0], img[i]);
            item.put(de[1], PG[i]);
            item.put(de[2], J[i]);
            item.put(de[3], V[i]);
            item.put(de[4], E[i]);
            item.put(de[5], D[i]);
            item.put(de[6], GP[i]);
            item.put(de[7], GC[i]);
            item.put(de[8], SG[i]);
            item.put(de[9], AP[i]);
            lista.add(item);
        }

        //SimpleAdapter adapter = new SimpleAdapter(this, lista,R.layout.line_item,de,para);

        SimpleAdapter adapter = new MeuAdaptador(this, lista, R.layout.line_item,de,para);
        listView.setAdapter(adapter);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view,
                                    int i, long l) {
                Toast.makeText(getApplicationContext(),i + "",
                        Toast.LENGTH_SHORT).show();
            }
        });


    }


}