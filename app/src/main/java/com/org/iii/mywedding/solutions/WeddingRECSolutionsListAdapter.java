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

public class WeddingRECSolutionsListAdapter extends ArrayAdapter<WeddingRECSolutions> {

    ArrayList<WeddingRECSolutions> solution;
    Context context;
    int resiurce;
    public WeddingRECSolutionsListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<WeddingRECSolutions> solution) {
        super(context, resource, solution);
        this.solution = solution;
        this.context = context;
        this.resiurce = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater layoutInflater = (LayoutInflater) getContext()
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.solution2_list_layout,null,true);
        }
        WeddingRECSolutions weddingRECSolutions = getItem(position);
        ///////////////////////////////////////////////////////////////////////
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewSolution1);
        Picasso.with(context).load("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com/"+weddingRECSolutions.getImagePic()).into(imageView);
        ////////////////////////////////////////////////////////////////////////
        TextView txtStoreName = (TextView)convertView.findViewById(R.id.txtStoreName1);
        txtStoreName.setText(weddingRECSolutions.getStoreName());
        ////////////////////////////////////////////////////////////////////////
        TextView txtserviceName = (TextView)convertView.findViewById(R.id.txtserviceName1);
        txtserviceName.setText(weddingRECSolutions.getServiceName());
        ////////////////////////////////////////////////////////////////////////
        TextView txtmaxPrice = (TextView)convertView.findViewById(R.id.txtmaxPrice1);
        txtmaxPrice.setText(weddingRECSolutions.getMaxPrice());
        return convertView;
    }
}
