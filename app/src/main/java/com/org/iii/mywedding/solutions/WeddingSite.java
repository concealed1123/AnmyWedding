package com.org.iii.mywedding.solutions;

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

public class WeddingSite extends AppCompatActivity {

    ArrayList<WeddingSiteSolutions> arraylist;
    ListView lv;
    String Storename = "";
    String Imgpic = "";
    String Servicename = "";
    String Maxprice = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("婚宴場地的方案");
        setContentView(R.layout.weddingsiteactivity);
        arraylist = new ArrayList<>();
        lv = (ListView)findViewById(R.id.listView3);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new ReadJSON().execute("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com/processWeddingSite.ashx");
            }
        });
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
                JSONArray jsonArray = jsonObject.getJSONArray("WeddingSiteSolution");


                for(int i =0;i<jsonArray.length();i++){
                    JSONObject solutionObject = jsonArray.getJSONObject(i);
                    Storename =solutionObject.getString("店家名");
                    //maxPrice=solutionObject.getString("最高價");
                    for(int j=0;j<(solutionObject.getJSONArray("tGalleryPhoto")).length();j++){
                        Imgpic=((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getString("方案封面");
                        for(int x=0;x<((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getJSONArray("tServices").length();x++){
                            Servicename=(((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getJSONArray("tServices").getJSONObject(x)).getString("服務名稱");
                            Maxprice  =(((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getJSONArray("tServices").getJSONObject(x)).getString("最高價");
                        }
                    }
                    arraylist.add(new WeddingSiteSolutions(Storename,Imgpic,Servicename,Maxprice));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            WeddingSiteSolutionsListAdapter adapter = new WeddingSiteSolutionsListAdapter(
                    getApplicationContext(),R.layout.solution4_list_layout,arraylist
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
