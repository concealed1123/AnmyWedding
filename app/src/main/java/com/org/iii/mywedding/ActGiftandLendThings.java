package com.org.iii.mywedding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActGiftandLendThings extends AppCompatActivity {
    private View.OnClickListener btnFirst_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(ActGiftandLendThings.this,ActPhotoServices.class));

        }
    };
    private View.OnClickListener btnNext_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(ActGiftandLendThings.this,ActPickphotoandArtedit.class));

        }
    };
    private View.OnClickListener btnPrevious_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(ActGiftandLendThings.this,ActPhotoProduction.class));

        }
    };
    private View.OnClickListener btnLast_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(ActGiftandLendThings.this,ActPayment.class));

        }
    };
    private View.OnClickListener btnList_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(ActGiftandLendThings.this,ActWeddingPhoto.class));

        }
    };
    private View.OnClickListener btnHome_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(ActGiftandLendThings.this,ActNavi.class));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actgiftandlendthings);
        InitialComponent();
    }

    private void InitialComponent() {
        btnFirst = (Button) findViewById(R.id.btnFirst);
        btnFirst.setOnClickListener(btnFirst_click);
        btnNext = (Button) findViewById(R.id.btnNext);
        btnNext.setOnClickListener(btnNext_click);
        btnPrevious = (Button) findViewById(R.id.btnPrevious);
        btnPrevious.setOnClickListener(btnPrevious_click);
        btnLast = (Button) findViewById(R.id.btnLast);
        btnLast.setOnClickListener(btnLast_click);
        btnList = (Button) findViewById(R.id.btnList);
        btnList.setOnClickListener(btnList_click);
        btnHome = (Button) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(btnHome_click);

    }
    Button btnFirst;
    Button btnNext;
    Button btnPrevious;
    Button btnLast;
    Button btnList;
    Button btnHome;
}
