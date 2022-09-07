package com.example.aula31_08_2022;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;

public class MeuAdaptador extends SimpleAdapter {

    public MeuAdaptador(Context ctx, List<HashMap<String, Object>> lista, int line_item,String[] de, int[] para) {
        super(ctx,lista,line_item,de,para);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = super.getView(position, convertView, parent);

        if (position % 2 == 0) {
            v.setBackgroundColor(Color.YELLOW);
            TextView tv = v.findViewById(R.id.txtpg);
            //tv.setBackgroundColor(Color.YELLOW);

            TextView tv1 = v.findViewById(R.id.txtd);
            TextView tv2 = v.findViewById(R.id.txte);
            TextView tv3 = v.findViewById(R.id.txtj);
            TextView tv4 = v.findViewById(R.id.txtap);
            TextView tv5 = v.findViewById(R.id.txtgc);
            TextView tv6 = v.findViewById(R.id.txtgp);
            TextView tv7 = v.findViewById(R.id.txtsg);
            TextView tv8 = v.findViewById(R.id.txtv);
            TextView tv9 = v.findViewById(R.id.pg);
            TextView tv10 = v.findViewById(R.id.j);
            TextView tv11 = v.findViewById(R.id.v);
            TextView tv12 = v.findViewById(R.id.gp);
            TextView tv13 = v.findViewById(R.id.e);
            TextView tv14 = v.findViewById(R.id.D);
            TextView tv15 = v.findViewById(R.id.gc);
            TextView tv16 = v.findViewById(R.id.sg);
            TextView tv17 = v.findViewById(R.id.ap);

            tv.setTextColor(Color.parseColor("#000000"));
            tv1.setTextColor(Color.parseColor("#000000"));
            tv2.setTextColor(Color.parseColor("#000000"));
            tv3.setTextColor(Color.parseColor("#000000"));
            tv4.setTextColor(Color.parseColor("#000000"));
            tv5.setTextColor(Color.parseColor("#000000"));
            tv6.setTextColor(Color.parseColor("#000000"));
            tv7.setTextColor(Color.parseColor("#000000"));
            tv8.setTextColor(Color.parseColor("#000000"));
            tv9.setTextColor(Color.parseColor("#000000"));
            tv10.setTextColor(Color.parseColor("#000000"));
            tv11.setTextColor(Color.parseColor("#000000"));
            tv12.setTextColor(Color.parseColor("#000000"));
            tv13.setTextColor(Color.parseColor("#000000"));
            tv14.setTextColor(Color.parseColor("#000000"));
            tv15.setTextColor(Color.parseColor("#000000"));
            tv16.setTextColor(Color.parseColor("#000000"));
            tv17.setTextColor(Color.parseColor("#000000"));

        }
        else {
            v.setBackgroundColor(Color.parseColor("#006400"));
            TextView tv = v.findViewById(R.id.txtpg);
            TextView tv1 = v.findViewById(R.id.txtd);
            TextView tv2 = v.findViewById(R.id.txte);
            TextView tv3 = v.findViewById(R.id.txtj);
            TextView tv4 = v.findViewById(R.id.txtap);
            TextView tv5 = v.findViewById(R.id.txtgc);
            TextView tv6 = v.findViewById(R.id.txtgp);
            TextView tv7 = v.findViewById(R.id.txtsg);
            TextView tv8 = v.findViewById(R.id.txtv);
            TextView tv9 = v.findViewById(R.id.pg);
            TextView tv10 = v.findViewById(R.id.j);
            TextView tv11 = v.findViewById(R.id.v);
            TextView tv12 = v.findViewById(R.id.gp);
            TextView tv13 = v.findViewById(R.id.e);
            TextView tv14 = v.findViewById(R.id.D);
            TextView tv15 = v.findViewById(R.id.gc);
            TextView tv16 = v.findViewById(R.id.sg);
            TextView tv17 = v.findViewById(R.id.ap);

            tv.setTextColor(Color.parseColor("#FFFFFF"));
            tv1.setTextColor(Color.parseColor("#FFFFFF"));
            tv2.setTextColor(Color.parseColor("#FFFFFF"));
            tv3.setTextColor(Color.parseColor("#FFFFFF"));
            tv4.setTextColor(Color.parseColor("#FFFFFF"));
            tv5.setTextColor(Color.parseColor("#FFFFFF"));
            tv6.setTextColor(Color.parseColor("#FFFFFF"));
            tv7.setTextColor(Color.parseColor("#FFFFFF"));
            tv8.setTextColor(Color.parseColor("#FFFFFF"));
            tv9.setTextColor(Color.parseColor("#FFFFFF"));
            tv10.setTextColor(Color.parseColor("#FFFFFF"));
            tv11.setTextColor(Color.parseColor("#FFFFFF"));
            tv12.setTextColor(Color.parseColor("#FFFFFF"));
            tv13.setTextColor(Color.parseColor("#FFFFFF"));
            tv14.setTextColor(Color.parseColor("#FFFFFF"));
            tv15.setTextColor(Color.parseColor("#FFFFFF"));
            tv16.setTextColor(Color.parseColor("#FFFFFF"));
            tv17.setTextColor(Color.parseColor("#FFFFFF"));
        }

        return v;
    }

}
