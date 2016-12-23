package eminhoiptv.com.br.eminhoiptv;

import java.util.ArrayList;

/**
 * Created by lleo on 23/12/2016.
 */
public class repositorioDeCanais {

    private ArrayList<Canal> canais;


    public repositorioDeCanais() {
        this.canais = new ArrayList<>();
    }

    public void addCanal(Canal c){
        canais.add(c);

    }

    public ArrayList<Canal> getCanais(){
        return this.canais;
    }
}
