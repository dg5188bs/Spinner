package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener , AdapterView.OnItemClickListener {
    Spinner spin;
    ListView lv;
    TextView tv1,tv2,tv3,tv4;
    String[] str = new String[4];
    String[][] clas = new String[4][10];
    String [][] clas2 = new String[4][10];
    String [][] clas3 = new String[4][10];
    String [][] clas4 = new String[4][10];
    ArrayAdapter<String> adpclass1,adpclass2,adpclass3,adpclass4;
    int k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.List1);
        spin = (Spinner) findViewById(R.id.spinner);
        tv1 = (TextView) findViewById(R.id.textView);
        tv2 = (TextView) findViewById(R.id.textView2);
        tv3 = (TextView) findViewById(R.id.textView3);
        tv4 = (TextView) findViewById(R.id.textView4);
        k=0;


        str[0] = "class1";
        str[1] = "class2";
        str[2] = "class3";
        str[3] = "class4";

        clas[0][0] = "Idan";
        clas[1][0] = "Bonkin";
        clas[2][0] = "23/9/2006";
        clas[3][0] = "0548364185";

        clas[0][1] = "Erel";
        clas[1][1] = "Ben baruch";
        clas[2][1] = "09/12/2006";
        clas[3][1] = "0522228615";

        clas[0][2] = "Dorel";
        clas[1][2] = "Guedj";
        clas[2][2] = "08/07/2006";
        clas[3][2] = "0586910852";

        clas[0][3] = "Antigona";
        clas[1][3] = "Ismena";
        clas[2][3] = "07/01/2006";
        clas[3][3] = "0589547315";

        clas[0][4] = "Soki";
        clas[1][4] = "Fegon";
        clas[2][4] = "02/11/2006";
        clas[3][4] = "0546254875";

        clas[0][5] = "Ron";
        clas[1][5] = "Gaon";
        clas[2][5] = "26/12/2006";
        clas[3][5] = "0569633226";

        clas[0][6] = "Shara";
        clas[1][6] = "Ramon";
        clas[2][6] = "04/08/2006";
        clas[3][6] = "0528745624";

        clas[0][7] = "Nisim";
        clas[1][7] = "Krief";
        clas[2][7] = "05/01/2006";
        clas[3][7] = "0536598745";

        clas[0][8] = "Tomer";
        clas[1][8] = "Ifergan";
        clas[2][8] = "06/01/2006";
        clas[3][8] = "0598755556";

        clas[0][9] = "Yonatan";
        clas[1][9] = "Messi";
        clas[2][9] = "07/01/2006";
        clas[3][9] = "0575454662";


        clas2[0][0] = "Ron";
        clas2[1][0] = "Corei";
        clas2[2][0] = "22/11/2006";
        clas2[3][0] = "0578885442";

        clas2[0][1] = "Slomi";
        clas2[1][1] = "Agnon";
        clas2[2][1] = "30/08/2006";
        clas2[3][1] = "05278336958";

        clas2[0][2] = "Nadav";
        clas2[1][2] = "Yakov";
        clas2[2][2] = "24/06/2006";
        clas2[3][2] = "0584510012";

        clas2[0][3] = "Ben";
        clas2[1][3] = "Levi";
        clas2[2][3] = "10/10/2006";
        clas2[3][3] = "0565524878";

        clas2[0][4] = "Max";
        clas2[1][4] = "Rorez";
        clas2[2][4] = "15/01/2006";
        clas2[3][4] = "0503255998";

        clas2[0][5] = "Noam";
        clas2[1][5] = "Li";
        clas2[2][5] = "26/03/2006";
        clas2[3][5] = "0544669325";

        clas2[0][6] = "Ziv";
        clas2[1][6] = "Shir";
        clas2[2][6] = "12/12/2006";
        clas2[3][6] = "0578998001";

        clas2[0][7] = "Rona";
        clas2[1][7] = "Sem Tov";
        clas2[2][7] = "14/09/2006";
        clas2[3][7] = "0531122980";

        clas2[0][8] = "Oliver";
        clas2[1][8] = "Kaz";
        clas2[2][8] = "03/02/2006";
        clas2[3][8] = "0512336585";

        clas2[0][9] = "David";
        clas2[1][9] = "Ovadia";
        clas2[2][9] = "23/11/2006";
        clas2[3][9] = "0533699858";

        clas3[0][0] = "Hadas";
        clas3[1][0] = "Wiss";
        clas3[2][0] = "14/05/2006";
        clas3[3][0] = "0569987447";

        clas3[0][1] = "Aviva";
        clas3[1][1] = "Dhan";
        clas3[2][1] = "07/04/2006";
        clas3[3][1] = "0544545623";

        clas3[0][2] = "Dan";
        clas3[1][2] = "Shomron";
        clas3[2][2] = "11/09/2006";
        clas3[3][2] = "0532211659";

        clas3[0][3] = "Sharon";
        clas3[1][3] = "Wissman";
        clas3[2][3] = "29/08/2006";
        clas3[3][3] = "0581000699";

        clas3[0][4] = "Arnon";
        clas3[1][4] = "Perez";
        clas3[2][4] = "17/11/2006";
        clas3[3][4] = "0589667852";

        clas3[0][5] = "Meni";
        clas3[1][5] = "Hason";
        clas3[2][5] = "26/07/2006";
        clas3[3][5] = "0569887354";

        clas3[0][6] = "Gil";
        clas3[1][6] = "Regev";
        clas3[2][6] = "29/3/2006";
        clas3[3][6] = "0563215478";

        clas3[0][7] = "Adi";
        clas3[1][7] = "Mesholam";
        clas3[2][7] = "05/05/2006";
        clas3[3][7] = "0538966523";

        clas3[0][8] = "Oren";
        clas3[1][8] = "Adler";
        clas3[2][8] = "06/11/2006";
        clas3[3][8] = "0522300148";

        clas3[0][9] = "Daniel";
        clas3[1][9] = "Shalom";
        clas3[2][9] = "19/04/2006";
        clas3[3][9] = "0544630079";

        clas4[0][0] = "Ziv";
        clas4[1][0] = "Lolo";
        clas4[2][0] = "14/07/2006";
        clas4[3][0] = "0541001458";

        clas4[0][1] = "Hadar";
        clas4[1][1] = "Josef";
        clas4[2][1] = "20/06/2006";
        clas4[3][1] = "0589665989";

        clas4[0][2] = "Bar";
        clas4[1][2] = "Ross";
        clas4[2][2] = "21/03/2006";
        clas4[3][2] = "0589336005";

        clas4[0][3] = "Erez";
        clas4[1][3] = "Gonen";
        clas4[2][3] = "16/08/2006";
        clas4[3][3] = "0530226598";

        clas4[0][4] = "Itay";
        clas4[1][4] = "Koshnir";
        clas4[2][4] = "25/09/2006";
        clas4[3][4] = "0574887965";

        clas4[0][5] = "Jessica";
        clas4[1][5] = "Trump";
        clas4[2][5] = "27/09/2006";
        clas4[3][5] = "0598306598";

        clas4[0][6] = "Eden";
        clas4[1][6] = "Dor";
        clas4[2][6] = "04/02/2006";
        clas4[3][6] = "0536001245";

        clas4[0][7] = "Nitay";
        clas4[1][7] = "Zeav";
        clas4[2][7] = "14/08/2006";
        clas4[3][7] = "0556485247";

        clas4[0][8] = "Lipaz";
        clas4[1][8] = "Gershon";
        clas4[2][8] = "11/07/2006";
        clas4[3][8] = "0578445785";

        clas4[0][9] = "Orly";
        clas4[1][9] = "Altanani";
        clas4[2][9] = "15/05/2006";
        clas4[3][9] = "0565983004";

        spin.setOnItemSelectedListener(this);
        lv.setOnItemClickListener(this);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,str);
        spin.setAdapter(adp);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        adpclass1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,clas[0]);
        adpclass2 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,clas2[0]);
        adpclass3 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,clas3[0]);
        adpclass4 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,clas4[0]);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        switch(i){
            case 0:
                lv.setAdapter(adpclass1);
                k=0;
                break;
            case 1:
                lv.setAdapter(adpclass2);
                k=1;
                break;
            case 2:
                lv.setAdapter(adpclass3);
                k=2;
                break;
            case 3:
                lv.setAdapter(adpclass4);
                k=3;
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        switch (k){
            case 0:
                tv1.setText(clas[0][i]);
                tv2.setText(clas[1][i]);
                tv3.setText(clas[2][i]);
                tv4.setText(clas[3][i]);
                break;
            case 1:
                tv1.setText(clas2[0][i]);
                tv2.setText(clas2[1][i]);
                tv3.setText(clas2[2][i]);
                tv4.setText(clas2[3][i]);
                break;
            case 2:
                tv1.setText(clas3[0][i]);
                tv2.setText(clas3[1][i]);
                tv3.setText(clas3[2][i]);
                tv4.setText(clas3[3][i]);
                break;
            case 3:
                tv1.setText(clas4[0][i]);
                tv2.setText(clas4[1][i]);
                tv3.setText(clas4[2][i]);
                tv4.setText(clas4[3][i]);
                break;
        }
    }
}