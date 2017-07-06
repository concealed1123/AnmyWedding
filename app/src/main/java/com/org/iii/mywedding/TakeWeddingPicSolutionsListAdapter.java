package com.org.iii.mywedding;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iii on 2017/7/6.
 */

public class TakeWeddingPicSolutionsListAdapter extends ArrayAdapter<TakeWeddingPicSolutions> {
    ArrayList<TakeWeddingPicSolutions> solution;
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
        Log.d("TakeWedding-->", takeWeddingPicSolutions.toString());
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageViewSolution);
        Picasso.with(context).load("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com/"+ takeWeddingPicSolutions.getSolutionsImage()).into(imageView);
        TextView txtserviceName = (TextView) convertView.findViewById(R.id.txtserviceName);
        txtserviceName.setText(takeWeddingPicSolutions.getServicesName());
        TextView txtmaxPrice = (TextView) convertView.findViewById(R.id.txtmaxPrice);
        txtmaxPrice.setText(takeWeddingPicSolutions.getMaxPrice());
        TextView txtSolutionName = (TextView)convertView.findViewById(R.id.txtSolutionName);
        txtSolutionName.setText(takeWeddingPicSolutions.getSoutionName());
        return  convertView;
    }
}
