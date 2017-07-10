package com.org.iii.mywedding;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.StackView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class StackMain extends Activity {

    private StackView stackView;
    private Button buttonPrevious;
    private Button buttonNext;

    private final String[] IMAGE_NAMES= {"/img/portfolio/test1.jpg","/img/portfolio/test2.jpg",
            "/img/portfolio/test3.jpg", "/img/portfolio/test4.jpg","/img/portfolio/test5.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stackviewmain);

        this.stackView = (StackView) findViewById(R.id.stackView);
        this.buttonNext =(Button) findViewById(R.id.button_next);
        this.buttonPrevious= (Button) findViewById(R.id.button_previous);

        List<StackItem> items = new ArrayList<StackItem>();

        for(String imageName: IMAGE_NAMES) {

            items.add(new StackItem(imageName, "http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com" + imageName));
        }

        StackAdapter adapt = new StackAdapter(this, R.layout.actstackview, items);
        stackView.clearAnimation();
        stackView.setAdapter(adapt);
        stackView.setHorizontalScrollBarEnabled(true);

        stackView.setBackgroundColor(Color.rgb(0, 0, 0));

        buttonNext.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                stackView.showNext();
            }
        });

        buttonPrevious.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                stackView.showPrevious();
            }
        });
    }


}