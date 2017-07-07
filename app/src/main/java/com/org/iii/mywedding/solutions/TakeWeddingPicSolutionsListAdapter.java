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
 * Created by Michael on 2017/7/7.
 */

public class TakeWeddingPicSolutionsListAdapter extends ArrayAdapter<TakeWeddingPicSolutions> {

    ArrayList<TakeWeddingPicSolutions>solution;
    Context context;
    int resource;
    public TakeWeddingPicSolutionsListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<TakeWeddingPicSolutions> solution) {
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
            convertView = layoutInflater.inflate(R.layout.solution1_list_layout,null,true);
        }
        TakeWeddingPicSolutions takeWeddingPicSolutions = getItem(position);
        /////////////////////////////////////////////////////////////////////
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageViewSolution);
        Picasso.with(context).load("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com/"+takeWeddingPicSolutions.getImagePic()).into(imageView);
        /////////////////////////////////////////////////////////////////////
        TextView txtStoreName = (TextView)convertView.findViewById(R.id.txtStoreName);
        txtStoreName.setText(takeWeddingPicSolutions.getStoreName());
        /////////////////////////////////////////////////////////////////////
        TextView txtserviceName = (TextView)convertView.findViewById(R.id.txtserviceName);
        txtserviceName.setText(takeWeddingPicSolutions.getServiceName());
        /////////////////////////////////////////////////////////////////////
        TextView txtmaxPrice = (TextView)convertView.findViewById(R.id.txtmaxPrice);
        txtmaxPrice.setText(takeWeddingPicSolutions.getMaxPrice());
        return convertView;
    }
}
