package com.example.phandinhphuong_19505081;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ListView lvPr;
    ProductsAdapter adt;
    ArrayList<Products> arrayList;

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.screen_2);
        lvPr =(ListView)findViewById(R.id.lvPr);
        arrayList = new ArrayList<>();
        arrayList.add(new Products(R.drawable.bione_removebg_preview,"Red Bull One","$350","$449"));
        arrayList.add(new Products(R.drawable.bifour__removebg_preview,"Blue One","$840","$950"));

        adt = new ProductsAdapter(this,R.layout.listview_item,arrayList);
        lvPr.setAdapter(adt);
    }

}