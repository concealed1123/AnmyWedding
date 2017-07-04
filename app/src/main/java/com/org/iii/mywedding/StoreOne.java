package com.org.iii.mywedding;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class StoreOne extends AppCompatActivity {
    ConnenctToMSSQL connenctToMSSQL = new ConnenctToMSSQL();
    URL url = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storeone);
        InitialComponent();
        connenctToMSSQL.open();
        viewData();
        StoName.setText(connenctToMSSQL.stores1.get(0));
        StoName.setTextColor(Color.MAGENTA);
        StoPhone.setText(connenctToMSSQL.stores1.get(1));
        StoPhone.setTextColor(Color.MAGENTA);
        StoEmail.setText(connenctToMSSQL.stores1.get(2));
        StoEmail.setTextColor(Color.MAGENTA);
        StoAddress.setText(connenctToMSSQL.stores1.get(3));
        StoAddress.setTextColor(Color.MAGENTA);




    }
    private void viewData(){
        connenctToMSSQL.getdata1("select fName,fPhone,fEmail,fAddress from tMember where fIdentity = 1 and fAccount = 'iii06'");
    }

    private void InitialComponent() {
        StoName = (TextView)findViewById(R.id.StoName);
        StoPhone = (TextView)findViewById(R.id.StoPhone);
        StoEmail = (TextView)findViewById(R.id.StoEmail);
        StoAddress = (TextView)findViewById(R.id.StoAddress);
        imgView = (ImageView)findViewById(R.id.imageView);


    }
    TextView StoName;
    TextView StoPhone;
    TextView StoEmail;
    TextView StoAddress;
    ImageView imgView;

    @Override
    protected void onStart() {
        super.onStart();



    }
}
