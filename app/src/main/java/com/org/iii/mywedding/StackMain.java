package com.org.iii.mywedding;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.StackView;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class StackMain extends Activity {

    private StackView stackView;
    private Button buttonPrevious;
    private Button buttonNext;

    private ArrayList<String> IMAGE_NAMES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stackviewmain);
        IMAGE_NAMES = new ArrayList();
        this.stackView = (StackView) findViewById(R.id.stackView);
        this.buttonNext = (Button) findViewById(R.id.button_next);
        this.buttonPrevious = (Button) findViewById(R.id.button_previous);


        Intent intent = getIntent();
        String fid = intent.getExtras().getString("fid");
        int CoS = intent.getExtras().getInt("CollectionOrSolution");

        StrictMode.ThreadPolicy l_policy =
                new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(l_policy);

        try {
//            view.getTag()
            URL url = new URL(CoS==1?("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com/ProcessAndroidGallery.ashx?fid=" + fid):("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com/ProcessAndroidSolution.ashx?fid="+fid));
            URLConnection con = url.openConnection();
            InputStream streamIn = con.getInputStream();

            BufferedReader r = new BufferedReader(new InputStreamReader(streamIn));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line);
            }

            String html = sb.toString();
            Log.d("html", html);

            JSONArray jsonArray = new JSONArray(html);
            for (int i = 0; i < jsonArray.length(); i++) {
                IMAGE_NAMES.add(jsonArray.getString(i));
            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }


        List<StackItem> items = new ArrayList<StackItem>();

        for (String imageName : IMAGE_NAMES) {

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

        buttonPrevious.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
                stackView.showPrevious();
            }
        });
    }
}