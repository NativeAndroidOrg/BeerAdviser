package com.bankapalli.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Spinner;
import android.view.View;

import java.util.List;

public class FindBeerActivity extends Activity {

    private BeerExpert beerExpert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer (View view) {
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color = (Spinner) findViewById(R.id.color);
        String selectedColour = String.valueOf(color.getSelectedItem());

        List<String> brandsList = beerExpert.getBrands(selectedColour);
        StringBuilder brandsFormatted = new StringBuilder();

        for (int i=0; i<brandsList.size(); i++) {
            brandsFormatted.append(brandsList.get(i)).append("\n");
        }

        brands.setText(brandsFormatted);
    }
}
