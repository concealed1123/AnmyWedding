package com.org.iii.mywedding.collection;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.org.iii.mywedding.R;
//import com.org.iii.mywedding.subCTakeWeddingPic;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class CTakeWeddingPic extends AppCompatActivity {

    ArrayList<CTakeWeddingPicCol> arrayList;
    ListView lv;
    String CollectionName = "";
    String CollectionImg = "";
    String CollectionDes = "";
    String id ="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ctakeweddingpicactivity);
        arrayList = new ArrayList<>();
        lv = (ListView)findViewById(R.id.ClistView);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new ReadJSON().execute("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com/processCTakeWeddingPic.ashx");
            }
        });
        /*lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String idd = arrayList.get(position).getId();
                //URL url =new URL("XXX.ashx?id="+idd);
                    //startActivity(new Intent(CTakeWeddingPic.this,subCTakeWeddingPic.class));

            }
        });*/

    }
    //建class解析JSON
    class ReadJSON extends AsyncTask<String,Integer,String> {

        @Override
        protected String doInBackground(String... params) {
            return readURL(params[0]);
        }

        @Override
        protected void onPostExecute(String content) {
            try {
                JSONObject jsonObject = new JSONObject(content);
                JSONArray jsonArray = jsonObject.getJSONArray("CTakeWeddingPic");
                for(int i=0;i<jsonArray.length();i++){
                    JSONObject collectionObject = jsonArray.getJSONObject(i);
                    CollectionName = collectionObject.getString("作品名");
                    CollectionDes = collectionObject.getString("簡述");
                    id = collectionObject.getString("id");
                    for(int j=0;j<(collectionObject.getJSONArray("tGalleryPhoto")).length();j++){
                        CollectionImg = ((collectionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getString("作品封面");
                    }
                    arrayList.add(new CTakeWeddingPicCol(CollectionName,CollectionImg,CollectionDes,id));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            CTakeWeddingPicColListAdapter adapter = new CTakeWeddingPicColListAdapter(
                    getApplicationContext(),R.layout.collection1_list_layout,arrayList
            );
            lv.setAdapter(adapter);
        }
    }
    //Read URL
    private static String readURL(String theURL){
        StringBuilder content = new StringBuilder();
        try {
            //建URL物件
            URL url = new URL(theURL);
            //建連線物件
            URLConnection urlConnection = url.openConnection();
            //將urlConnection包進bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            //不為null content就加line
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
