package com.org.iii.mywedding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActChooseDressandBorrow extends AppCompatActivity {

    private View.OnClickListener btnFirst_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    private View.OnClickListener btnNext_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    private View.OnClickListener btnPrevious_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    private View.OnClickListener btnLast_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    private View.OnClickListener btnList_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actchoosedressandborrow);
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

    }
    Button btnFirst;
    Button btnNext;
    Button btnPrevious;
    Button btnLast;
    Button btnList;
}
