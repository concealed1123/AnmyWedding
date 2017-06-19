package com.org.iii.mywedding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActManual extends AppCompatActivity {

    private View.OnClickListener imgbtnWeddingPhoto_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(ActManual.this,ActWeddingPhoto.class);
            startActivity(intent);

        }
    };
    private View.OnClickListener imgbtnWeddingRec_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    private View.OnClickListener imgbtnWeddingSec_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
    private View.OnClickListener imgbtnWeddingPlace_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmanual);
        InitialComponent();
    }

    private void InitialComponent() {
        imgbtnWeddingPhoto = (ImageButton) findViewById(R.id.imgbtnWeddingPhoto);
        imgbtnWeddingPhoto.setOnClickListener(imgbtnWeddingPhoto_click);
        imgbtnWeddingRec = (ImageButton) findViewById(R.id.imgbtnWeddingRec);
        imgbtnWeddingRec.setOnClickListener(imgbtnWeddingRec_click);
        imgbtnWeddingSec = (ImageButton) findViewById(R.id.imgbtnWeddingSec);
        imgbtnWeddingSec.setOnClickListener(imgbtnWeddingSec_click);
        imgbtnWeddingPlace = (ImageButton) findViewById(R.id.imgbtnWeddingPlace);
        imgbtnWeddingPlace.setOnClickListener(imgbtnWeddingPlace_click);

    }
    ImageButton imgbtnWeddingPhoto;
    ImageButton imgbtnWeddingRec;
    ImageButton imgbtnWeddingSec;
    ImageButton imgbtnWeddingPlace;


}
