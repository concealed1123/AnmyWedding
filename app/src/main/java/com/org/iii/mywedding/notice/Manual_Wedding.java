package com.org.iii.mywedding.notice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.org.iii.mywedding.R;

import org.w3c.dom.Text;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class Manual_Wedding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual__wedding);

        txtManual_Wedding = (TextView)findViewById(R.id.txtManual_Wedding);




    }

//    private void Manual_URL() {
//       new Thread(new Runnable() {
//           @Override
//           public void run() {
//               OkHttpClient client = new OkHttpClient();
//               Request request = new Request.Builder()
//                       .url("")
//
//                       .build();
//           }
//       });
//    }







    TextView txtManual_Wedding;
}
