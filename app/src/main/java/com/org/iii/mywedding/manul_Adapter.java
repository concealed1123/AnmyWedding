//package com.org.iii.mywedding;
//
//import android.app.Activity;
//import android.content.Context;
//import android.support.annotation.LayoutRes;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Adapter;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
//import android.widget.ListView;
//import android.widget.TextView;
//
//import com.org.iii.mywedding.R;
//import com.org.iii.mywedding.solutions.WeddingSiteSolutions;
//import com.squareup.picasso.Picasso;
//
//import java.util.ArrayList;
//
//
//
//public class manul_Adapter extends ArrayAdapter<PhotoNotice> {
//    String[] PhotoNotice = {"攝影服務","化妝造型","攝影產品",
//            "贈品&出借物品","挑片&美編","禮服選擇&出借","付款"};
//
//    Context context;
//    int resource;
//    public manul_Adapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<PhotoNotice> solution) {
//        super(context, resource, solution);
//        this.solution = solution;
//        this.context = context;
//        this.resource = resource;
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        if(convertView == null){
//
//            LayoutInflater layoutInflater = (LayoutInflater) getContext()
//                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
//            convertView = layoutInflater.inflate(R.layout.manul_adapter,null,true);
//        }
//        TextView manuladapter = (TextView)convertView.findViewById(R.id.manuladapter);
//        ListView myListView = (ListView)convertView.findViewById(R.id.myListView);
//
//        return convertView;
//    }
//
//}