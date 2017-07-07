package com.org.iii.mywedding.collection;

import android.app.Activity;
import android.content.Context;
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
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by iii on 2017/7/7.
 */

public class CWeddingSiteCollectionListAdapter extends ArrayAdapter<CWeddingSiteCollection> {

    ArrayList<CWeddingSiteCollection>collection;
    Context context;
    int resource;
    public CWeddingSiteCollectionListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<CWeddingSiteCollection> collection) {
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
        CWeddingSiteCollection cWeddingSiteCollection = getItem(position);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageViewCollections4);
        Picasso.with(context).load("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com"+cWeddingSiteCollection.getCollectionImg()).into(imageView);
        ///////////////////////////////////////////////////////////////////////////////////////////
        TextView txtCollectionName = (TextView)convertView.findViewById(R.id.txtCollectionName4);
        txtCollectionName.setText(cWeddingSiteCollection.getCollectionName());
        ///////////////////////////////////////////////////////////////////////////////////////////
        TextView txtCollectionDescribe = (TextView)convertView.findViewById(R.id.txtCollectionDescribe4);
        txtCollectionDescribe.setText(cWeddingSiteCollection.getCollectionDes());
        return convertView;
    }
}
