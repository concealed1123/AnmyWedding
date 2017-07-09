package com.org.iii.mywedding.collection;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.org.iii.mywedding.R;

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

public class CBrideSec extends AppCompatActivity {

    ArrayList<CBrideSecCollection>arrayList;
    ListView lv;
    String CollectionName = "";
    String CollectionImg = "";
    String CollectionDes = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("新娘秘書作品集");
        setContentView(R.layout.cbridesecactivity);
        arrayList = new ArrayList<>();
        lv = (ListView)findViewById(R.id.ClistView3);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new ReadJSON().execute("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com/processCBrideSec.ashx");
            }
        });
    }
    class ReadJSON extends AsyncTask<String,Integer,String> {

        @Override
        protected String doInBackground(String... params) {
            return readURL(params[0]);
        }

        @Override
        protected void onPostExecute(String content) {
            try {
                JSONObject jsonObject = new JSONObject(content);
                JSONArray jsonArray = jsonObject.getJSONArray("CBrideSec");
                for(int i=0;i<jsonArray.length();i++){
                    JSONObject collectionObject = jsonArray.getJSONObject(i);
                    CollectionName = collectionObject.getString("作品名");
                    CollectionDes = collectionObject.getString("簡述");
                    for(int j=0;j<(collectionObject.getJSONArray("tGalleryPhoto")).length();j++){
                        CollectionImg = ((collectionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getString("作品封面");
                    }
                    arrayList.add(new CBrideSecCollection(CollectionName,CollectionImg,CollectionDes));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            CBrideSecCollectionListAdapter adapter = new CBrideSecCollectionListAdapter(
                    getApplicationContext(),R.layout.collection3_list_layout,arrayList
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
