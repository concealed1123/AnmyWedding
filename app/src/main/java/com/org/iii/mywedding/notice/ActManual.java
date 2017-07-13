package com.org.iii.mywedding.notice;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.org.iii.mywedding.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class ActManual extends Activity {

    public ArrayList<String> PhotoNotice ;
    public ArrayList<Integer> PhotoNoticeId;
    public String PhotoNoticeContent ;
     class manul_Adapter extends BaseAdapter{


        LayoutInflater layoutInflater;
        Context context;

         public manul_Adapter(Context context){
             this.context = context;
             layoutInflater = LayoutInflater.from(this.context);
         }



        @Override
        public int getCount() {

            return PhotoNotice.size();
        }

        @Nullable
        @Override
        public Object getItem(int position) {

            return position;

        }

        @Override
        public long getItemId(int position) {

            return position;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            if(convertView == null){

                convertView = layoutInflater.inflate(R.layout.manul_adapter,null);
                TextView txt_manul_adapter = (TextView)convertView.findViewById(R.id.txt_manul_adapter);
                txt_manul_adapter.setText(PhotoNotice.get(position));
                convertView.setTag(PhotoNoticeId.get(position));

            }



            return convertView;
        }


    }
    private AdapterView.OnItemClickListener manual_listview_click = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//            view.getTag();
//            Bundle bund  = new Bundle();
//            bund.putInt("class", position+1);
//            Intent intent = new Intent(getActivity(),ActManual.class);
//            intent.putExtras(bund);
//            startActivity(intent);

            StrictMode.ThreadPolicy l_policy =
                    new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(l_policy);

            try {

                URL url = new URL("http://13.114.47.63/ProcessAndroidManualContent.ashx?fid=" + view.getTag());
                URLConnection con = url.openConnection();
                InputStream streamIn=con.getInputStream();

                BufferedReader r = new BufferedReader(new InputStreamReader(streamIn));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = r.readLine()) != null) {
                    sb.append(line);
                }

                String html=sb.toString();
                Log.d("html", html);


               String replace = html.replaceAll("(?:<li>|<ol>|\\r\\n|</li>|</ol>|<h6>|</h6>|<p>|</p>|<br/>|<b>|</b>|<ul>|</ul>)","");

//                Toast.makeText(ActManual.this,replace,Toast.LENGTH_SHORT).show();

// 1. Instantiate an AlertDialog.Builder with its constructor
                AlertDialog.Builder builder = new AlertDialog.Builder(ActManual.this);

// 2. Chain together various setter methods to set the dialog characteristics
                builder.setMessage(replace)
                        .setTitle(PhotoNotice.get(position));

// 3. Get the AlertDialog from create()
                AlertDialog dialog = builder.create();
                dialog.show();


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }






        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actmanual);

        PhotoNotice = new ArrayList<>();
        PhotoNoticeId = new ArrayList<>();
//            Intent intent = new Intent(ActManual.this,ActManual.class);
        Intent intent = getIntent();
        String data = intent.getExtras().getString("class");

        StrictMode.ThreadPolicy l_policy =
                new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(l_policy);

        try {

            URL url = new URL("http://13.114.47.63/ProcessAndroidManual.ashx?class=" + data);
            URLConnection con = url.openConnection();
            InputStream streamIn=con.getInputStream();

            BufferedReader r = new BufferedReader(new InputStreamReader(streamIn));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line);
            }

            String html=sb.toString();
            Log.d("html", html);
            JSONArray jsonArray = new JSONArray(html);
            for(int i = 0; i < jsonArray.length(); i++){
                PhotoNoticeId.add(jsonArray.getJSONObject(i).getInt("id"));
                PhotoNotice.add(jsonArray.getJSONObject(i).getString("Title"));

            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }

        manual_listview = (ListView)findViewById(R.id.manual_listview);

        manual_listview.setOnItemClickListener(manual_listview_click);

        manul_Adapter adapter = new manul_Adapter(this);

//        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,PhotoNotice);
        manual_listview.setAdapter(adapter);

    }
    ListView manual_listview;
}
