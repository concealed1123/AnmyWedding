package com.org.iii.mywedding;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class TakeWeddingPic extends AppCompatActivity {
    ArrayList<TakeWeddingPicSolutions> arraylist;
    ListView lv;
    String solutionsImage="",servicesName="",solutionName="",maxPrice="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_wedding_pic);
        arraylist = new ArrayList<>();
        lv = (ListView)findViewById(R.id.listView);
        //String id = "";
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new ReadJSON().execute("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com/processTakeWeddingPicSolution.ashx");
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
                JSONArray jsonArray = jsonObject.getJSONArray("TakeWeddingPicSolution");


                for(int i =0;i<jsonArray.length();i++){
                    JSONObject solutionObject = jsonArray.getJSONObject(i);
                    servicesName=solutionObject.getString("廠商的方案");
                    maxPrice=solutionObject.getString("最高價");
                    for(int j=0;j<(solutionObject.getJSONArray("tGalleryPhoto")).length();j++){
                        solutionsImage=((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getString("方案封面");
                        for(int x=0;x<((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getJSONArray("tServicesSubClass").length();x++){
                            solutionName=(((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getJSONArray("tServicesSubClass").getJSONObject(x)).getString("方案名稱");
                        }
                    }
                    arraylist.add(new TakeWeddingPicSolutions(solutionsImage,servicesName,solutionName,maxPrice));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            TakeWeddingPicSolutionsListAdapter adapter = new TakeWeddingPicSolutionsListAdapter(
                    getApplicationContext(),R.layout.solution1_list_layout,arraylist
            );
            lv.setAdapter(adapter);

        }
    }
    private static String readURL(String theUrl) {
        StringBuilder content = new StringBuilder();
        try {
            // create a url object
            URL url = new URL(theUrl);
            // create a urlconnection object
            URLConnection urlConnection = url.openConnection();
            // wrap the urlconnection in a bufferedreader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            // read from the urlconnection via the bufferedreader
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
