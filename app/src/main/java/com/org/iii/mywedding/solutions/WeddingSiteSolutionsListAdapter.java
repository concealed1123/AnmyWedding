package com.org.iii.mywedding.solutions;

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

public class WeddingSiteSolutionsListAdapter extends ArrayAdapter<WeddingSiteSolutions> {
    ArrayList<WeddingSiteSolutions>solution;
    Context context;
    int resource;
    public WeddingSiteSolutionsListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<WeddingSiteSolutions> solution) {
        super(context, resource, solution);
        this.solution = solution;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.solution4_list_layout,null,true);
        }
        WeddingSiteSolutions weddingSiteSolutions = getItem(position);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewSolution3);
        Picasso.with(context).load("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com"+weddingSiteSolutions.getImagePic()).into(imageView);
        //////////////////////////////////////////////////////////////////////////////////
        TextView txtStoreName = (TextView)convertView.findViewById(R.id.txtStoreName3);
        txtStoreName.setText(weddingSiteSolutions.getStoreName());
        ////////////////////////////////////////////////////////////////////////
        TextView txtserviceName = (TextView)convertView.findViewById(R.id.txtserviceName3);
        txtserviceName.setText(weddingSiteSolutions.getServiceName());
        ////////////////////////////////////////////////////////////////////////
        TextView txtmaxPrice = (TextView)convertView.findViewById(R.id.txtmaxPrice3);
        txtmaxPrice.setText(weddingSiteSolutions.getMaxPrice());
        return convertView;
    }
}
