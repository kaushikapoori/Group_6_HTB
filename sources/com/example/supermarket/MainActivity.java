package com.example.supermarket;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import d.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class MainActivity extends h {

    /* renamed from: o  reason: collision with root package name */
    public TextView f2073o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f2074p;

    /* renamed from: q  reason: collision with root package name */
    public EditText f2075q;

    /* renamed from: r  reason: collision with root package name */
    public double f2076r = 5.0d;

    /* renamed from: s  reason: collision with root package name */
    public double f2077s = 50.0d;

    /* renamed from: t  reason: collision with root package name */
    public int f2078t = 0;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2079u = false;

    /* renamed from: v  reason: collision with root package name */
    public ListView f2080v;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f2081w = new ArrayList<>();

    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Button f2082b;

        public a(Button button) {
            this.f2082b = button;
        }

        public void onClick(View view) {
            MainActivity mainActivity = MainActivity.this;
            if (mainActivity.f2079u) {
                mainActivity.finish();
                System.exit(0);
            }
            MainActivity mainActivity2 = MainActivity.this;
            if (mainActivity2.f2077s < 50.0d) {
                Toast.makeText(mainActivity2, "Order placed successfully. Estimated delivery time 45 mintues.", 1).show();
                this.f2082b.setText("Exit");
                MainActivity.this.f2079u = true;
                return;
            }
            Toast.makeText(mainActivity2, "Please select an item to buy.", 0).show();
        }
    }

    public class b implements TextWatcher {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String[] f2084b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String[] f2085c;

        public b(String[] strArr, String[] strArr2) {
            this.f2084b = strArr;
            this.f2085c = strArr2;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            try {
                String obj = MainActivity.this.f2075q.getText().toString();
                MainActivity mainActivity = MainActivity.this;
                String stringFromJNI = mainActivity.stringFromJNI();
                Objects.requireNonNull(mainActivity);
                SecretKeySpec secretKeySpec = new SecretKeySpec(mainActivity.stringFromJNI2().getBytes(), mainActivity.stringFromJNI3());
                Cipher instance = Cipher.getInstance(mainActivity.stringFromJNI3());
                instance.init(2, secretKeySpec);
                int i5 = 0;
                if (!obj.equals(new String(instance.doFinal(Base64.decode(stringFromJNI, 0)), "utf-8"))) {
                    MainActivity.this.f2081w.clear();
                    MainActivity.this.f2076r = 5.0d;
                    while (true) {
                        String[] strArr = this.f2085c;
                        if (i5 >= strArr.length) {
                            break;
                        }
                        MainActivity.this.f2081w.add(strArr[i5]);
                        i5++;
                    }
                } else {
                    MainActivity.this.f2081w.clear();
                    MainActivity.this.f2076r = 2.5d;
                    while (true) {
                        String[] strArr2 = this.f2084b;
                        if (i5 >= strArr2.length) {
                            break;
                        }
                        MainActivity.this.f2081w.add(strArr2[i5]);
                        i5++;
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            MainActivity.this.s();
        }
    }

    public class c extends e {
        public c(MainActivity mainActivity, Context context, int i2, List list) {
            super(mainActivity, context, i2, list);
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i2, view, viewGroup);
            TextView textView = (TextView) view2.findViewById(16908308);
            textView.setTextColor(Color.parseColor("#D9D3D1"));
            textView.setTextSize(Float.parseFloat("14"));
            return view2;
        }
    }

    public class d implements AdapterView.OnItemClickListener {

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                MainActivity mainActivity = MainActivity.this;
                double d2 = mainActivity.f2077s;
                if (d2 > 0.0d) {
                    mainActivity.f2077s = d2 - mainActivity.f2076r;
                    mainActivity.f2078t++;
                }
                if (mainActivity.f2077s == 0.0d) {
                    Toast.makeText(mainActivity, "You don't have enough money!", 0).show();
                }
                MainActivity.this.f2073o.setText(String.valueOf(MainActivity.this.f2077s) + "$");
                TextView textView = MainActivity.this.f2074p;
                StringBuilder a2 = androidx.activity.result.a.a("Basket (");
                a2.append(String.valueOf(MainActivity.this.f2078t));
                a2.append(")");
                textView.setText(a2.toString());
            }
        }

        public d() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            String str = (String) adapterView.getItemAtPosition(i2);
            view.animate().setDuration(100).alpha(1.0f).withEndAction(new a());
        }
    }

    public class e extends ArrayAdapter<String> {

        /* renamed from: b  reason: collision with root package name */
        public HashMap<String, Integer> f2089b = new HashMap<>();

        public e(MainActivity mainActivity, Context context, int i2, List<String> list) {
            super(context, i2, list);
            for (int i3 = 0; i3 < list.size(); i3++) {
                this.f2089b.put(list.get(i3), Integer.valueOf(i3));
            }
        }

        public long getItemId(int i2) {
            return (long) this.f2089b.get((String) getItem(i2)).intValue();
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    static {
        System.loadLibrary("supermarket");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.txtBalance);
        this.f2073o = textView;
        textView.setText(String.valueOf(this.f2077s) + "$");
        TextView textView2 = (TextView) findViewById(R.id.txtBasket);
        this.f2074p = textView2;
        StringBuilder a2 = androidx.activity.result.a.a("Basket (");
        a2.append(String.valueOf(this.f2078t));
        a2.append(")");
        textView2.setText(a2.toString());
        this.f2075q = (EditText) findViewById(R.id.edtDiscount);
        ListView listView = (ListView) findViewById(R.id.listview);
        this.f2080v = listView;
        ConstraintLayout.a aVar = (ConstraintLayout.a) listView.getLayoutParams();
        aVar.height = 800;
        this.f2080v.setLayoutParams(aVar);
        String[] strArr = {"Whole wheat bread\n5.00$", "Pita pockets\n5.00$", "English muffins\n5.00$", "Whole-grain flour tortillas\n5.00$", "Skinless chicken breasts\n5.00$", "Ground turkey\n5.00$", "Salmon\n5.00$", "Brown rice\n5.00$", "Tomato sauce\n5.00$", "Mustard\n5.00$", "Barbecue sauce\n5.00$", "Red-wine vinegar\n5.00$", "Salsa\n5.00$", "Extra virgin olive oil\n5.00$", "Hot pepper sauce\n5.00$", "Tuna packed in water\n5.00$", "Frozen shrimp\n5.00$", "Garbanzo beans\n5.00$", "Broccoli\n5.00$", "Spinach\n5.00$", "Carrots\n5.00$", "Whole-grain waffles\n5.00$", "Whole-grain vegetable pizza\n5.00$"};
        String[] strArr2 = {"Whole wheat bread\n2.50$", "Pita pockets\n2.50$", "English muffins\n2.50$", "Whole-grain flour tortillas\n2.50$", "Skinless chicken breasts\n2.50$", "Ground turkey\n2.50$", "Salmon\n2.50$", "Brown rice\n2.50$", "Tomato sauce\n2.50$", "Mustard\n2.50$", "Barbecue sauce\n2.50$", "Red-wine vinegar\n2.50$", "Salsa\n2.50$", "Extra virgin olive oil\n2.50$", "Hot pepper sauce\n2.50$", "Tuna packed in water\n2.50$", "Frozen shrimp\n2.50$", "Garbanzo beans\n2.50$", "Broccoli\n2.50$", "Spinach\n2.50$", "Carrots\n2.50$", "Whole-grain waffles\n2.50$", "Whole-grain vegetable pizza\n2.50$"};
        for (int i2 = 0; i2 < 23; i2++) {
            this.f2081w.add(strArr[i2]);
        }
        s();
        Button button = (Button) findViewById(R.id.btnBuy);
        button.setOnClickListener(new a(button));
        this.f2075q.addTextChangedListener(new b(strArr2, strArr));
    }

    public void s() {
        this.f2080v.setAdapter(new c(this, this, 17367043, this.f2081w));
        this.f2080v.setOnItemClickListener(new d());
    }

    public native String stringFromJNI();

    public native String stringFromJNI2();

    public native String stringFromJNI3();
}
