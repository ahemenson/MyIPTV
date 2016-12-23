package eminhoiptv.com.br.eminhoiptv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener{

    private ArrayList<Canal> addCanais;
    private ListView listCanais;
    repositorioDeCanais repoCanais = new repositorioDeCanais();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCanais  = (ListView) findViewById(R.id.listView);
        Canal canal1 = new Canal();
        canal1.setNome("Sbt");
        canal1.setTipo("aberta");
        repoCanais.addCanal(canal1);
        atualizarLista();

    }

    @Override
    public void onClick(View v) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    public void atualizarLista(){

        addCanais = repoCanais.getCanais();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, addCanais);
        listCanais.setAdapter(adapter);
        listCanais.setOnItemClickListener(this);
    }
}
