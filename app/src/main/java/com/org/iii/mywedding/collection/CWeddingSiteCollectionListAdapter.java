package com.org.iii.mywedding.collection;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.org.iii.mywedding.R;
import com.org.iii.mywedding.StackMain;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by iii on 2017/7/7.
 */

public class CWeddingSiteCollectionListAdapter extends ArrayAdapter<CTakeWeddingPicCol> {

    ArrayList<CTakeWeddingPicCol>collection;
    Context context;
    int resource;
    public CWeddingSiteCollectionListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<CTakeWeddingPicCol> collection) {
        super(context, resource, collection);
        this.collection = collection;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.collection4_list_layout,null,true);
        }
        convertView.setTag(collection.get(position).getCollectionFid());
        CTakeWeddingPicCol cWeddingSiteCollection = getItem(position);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageViewCollections4);
        Picasso.with(context).load("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com"+cWeddingSiteCollection.getCollectionImg()).into(imageView);
        ///////////////////////////////////////////////////////////////////////////////////////////
       final TextView txtCollectionName = (TextView)convertView.findViewById(R.id.txtCollectionName4);
        txtCollectionName.setText(cWeddingSiteCollection.getCollectionName());
        ///////////////////////////////////////////////////////////////////////////////////////////
        TextView txtCollectionDescribe = (TextView)convertView.findViewById(R.id.txtCollectionDescribe4);
        txtCollectionDescribe.setText(cWeddingSiteCollection.getCollectionDes());
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,StackMain.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                Bundle bundle = new Bundle();
                bundle.putString("fid",v.getTag().toString());
                bundle.putString("ServiceTitle",txtCollectionName.getText().toString());
                bundle.putInt("CollectionOrSolution",1);
                intent.putExtras(bundle);
                context.startActivity(intent);
//                Bundle bund  = new Bundle();
//                bund.putString("class","2");
//                Intent intent = new Intent(getActivity(),ActManual.class);
//                intent.putExtras(bund);
//                startActivity(intent);

            }
        });
        return convertView;
    }
}
