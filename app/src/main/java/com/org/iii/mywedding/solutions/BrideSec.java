package com.org.iii.mywedding.solutions;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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

public class BrideSec extends AppCompatActivity {
    ArrayList<BrideSecSolutions> arraylist;
    ListView lv;
    String Storename = "";
    String Imgpic = "";
    String Servicename = "";
    String Maxprice = "";
    int CollectionFid =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();

        final int  sid = intent.getExtras().getInt("ServiceClass");



        this.setTitle(settitle(sid));
        setContentView(R.layout.bridesecactivity);
        arraylist = new ArrayList<>();
        lv = (ListView)findViewById(R.id.listView2);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                new ReadJSON().execute("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com/processBrideSec.ashx?sid="+ sid);
            }
        });
    }


    private String settitle(int sid){

        if(sid == 1)
            return "新娘秘書的方案";
        if(sid == 2)
            return "婚禮攝影的方案";
        if(sid == 3)
            return "新娘秘書的方案";
        if(sid == 4)
            return "婚宴場地的方案";
         return "";
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
                JSONArray jsonArray = jsonObject.getJSONArray("BrideSecSolution");

                for(int i =0;i<jsonArray.length();i++){

                    JSONObject solutionObject = jsonArray.getJSONObject(i);

                    CollectionFid = solutionObject.getInt("fid");

                    Servicename = solutionObject.getString("服務名稱");

                    Maxprice = solutionObject.getString("最高價");

                    JSONArray Member = new JSONArray(solutionObject.getString("tMember")) ;

                    for(int j=0;j<Member.length();j++){

                          Member.getJSONObject(j).getJSONArray("tGalleryPhoto");

                        Storename =  Member.getJSONObject(j).getString("店家名");
                        for(int k=0;k< Member.getJSONObject(j).getJSONArray("tGalleryPhoto").length();k++){
                            Imgpic = Member.getJSONObject(j).getJSONArray("tGalleryPhoto").getJSONObject(k).getString("方案封面");


                        }
                    }
                    //maxPrice=solutionObject.getString("最高價");
//                    for(int j=0;j<(solutionObject.getJSONArray("tGalleryPhoto")).length();j++){
//                        Imgpic=((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getString("方案封面");
//                        for(int x=0;x<((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getJSONArray("tServices").length();x++){
//                            Servicename=(((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getJSONArray("tServices").getJSONObject(x)).getString("服務名稱");
//                            Maxprice  =(((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getJSONArray("tServices").getJSONObject(x)).getString("最高價");
//                            CollectionFid = (((solutionObject.getJSONArray("tGalleryPhoto")).getJSONObject(j)).getJSONArray("tServices").getJSONObject(x)).getInt("fid");
//                        }
//                    }
                    arraylist.add(new BrideSecSolutions(Storename,Imgpic,Servicename,Maxprice,CollectionFid));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            BrideSecSolutionsListAdapter adapter = new BrideSecSolutionsListAdapter(
                    getApplicationContext(),R.layout.solution3_list_layout,arraylist
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
