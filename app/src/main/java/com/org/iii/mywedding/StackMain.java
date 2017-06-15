package com.org.iii.mywedding;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.StackView;

import java.util.ArrayList;
import java.util.List;

public class StackMain extends Activity {

    private StackView stackView;
    private Button buttonPrevious;
    private Button buttonNext;

    private final String[] IMAGE_NAMES= {"image1","image2", "image3", "image4","image5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stackviewmain);

        this.stackView = (StackView) findViewById(R.id.stackView);
        this.buttonNext =(Button) findViewById(R.id.button_next);
        this.buttonPrevious= (Button) findViewById(R.id.button_previous);

        List<StackItem> items = new ArrayList<StackItem>();

        for(String imageName: IMAGE_NAMES) {
            items.add(new StackItem(imageName+".png", imageName));
        }

        StackAdapter adapt = new StackAdapter(this, R.layout.actstackview, items);
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