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

public class BrideSecSolutionsListAdapter extends ArrayAdapter<BrideSecSolutions> {

    ArrayList<BrideSecSolutions>solution;
    Context context;
    int resource;
    public BrideSecSolutionsListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<BrideSecSolutions> solution) {
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
            convertView = layoutInflater.inflate(R.layout.solution3_list_layout,null,true);
        }
        BrideSecSolutions brideSecSolutions = getItem(position);
        ///////////////////////////////////////////////////////////////////////////////////
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewSolution2);
        Picasso.with(context).load("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com"+brideSecSolutions.getImagePic()).into(imageView);
        ///////////////////////////////////////////////////////////////////////////////////
        TextView txtStoreName = (TextView)convertView.findViewById(R.id.txtStoreName2);
        txtStoreName.setText(brideSecSolutions.getStoreName());
        ////////////////////////////////////////////////////////////////////////
        TextView txtserviceName = (TextView)convertView.findViewById(R.id.txtserviceName2);
        txtserviceName.setText(brideSecSolutions.getServiceName());
        ////////////////////////////////////////////////////////////////////////
        TextView txtmaxPrice = (TextView)convertView.findViewById(R.id.txtmaxPrice2);
        txtmaxPrice.setText(brideSecSolutions.getMaxPrice());
        return convertView;
    }
}
