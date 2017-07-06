package com.org.iii.mywedding;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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

public class WeddingRECSolutionsListAdapter extends ArrayAdapter<WeddingRECSolutions> {
    ArrayList<WeddingRECSolutions> solution;
    Context context;
    int resource;
    public WeddingRECSolutionsListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<WeddingRECSolutions> solution) {
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
            convertView = layoutInflater.inflate(R.layout.solution2_list_layout,null,true);

        }
        WeddingRECSolutions weddingRECSolutions = getItem(position);
        ImageView imageView = (ImageView)convertView.findViewById(R.id.imageViewSolution1);
        Picasso.with(context).load("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com/"+ weddingRECSolutions.getSolutionsImage()).into(imageView);
        TextView txtserviceName = (TextView) convertView.findViewById(R.id.txtserviceName1);
        txtserviceName.setText(weddingRECSolutions.getServicesName());
        TextView txtmaxPrice = (TextView) convertView.findViewById(R.id.txtmaxPrice1);
        txtmaxPrice.setText(weddingRECSolutions.getMaxPrice());
        TextView txtSolutionName = (TextView)convertView.findViewById(R.id.txtSolutionName1);
        txtSolutionName.setText(weddingRECSolutions.getSolutionName());







        return  convertView;
    }
}
