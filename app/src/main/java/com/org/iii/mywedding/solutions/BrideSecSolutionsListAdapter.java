package com.org.iii.mywedding.solutions;

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
        convertView.setTag(solution.get(position).getCollectionFid());
//        BrideSecSolutions brideSecSolutions = getItem(position);
        ///////////////////////////////////////////////////////////////////////////////////
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageViewSolution2);
        Picasso.with(context).load("http://ec2-13-114-47-63.ap-northeast-1.compute.amazonaws.com"+solution.get(position).getImagePic()).into(imageView);
        ///////////////////////////////////////////////////////////////////////////////////
        TextView txtStoreName = (TextView)convertView.findViewById(R.id.txtStoreName2);
        txtStoreName.setText(solution.get(position).getStoreName());
        ////////////////////////////////////////////////////////////////////////
        final TextView txtserviceName = (TextView)convertView.findViewById(R.id.txtserviceName2);
        txtserviceName.setText(solution.get(position).getServiceName());
        ////////////////////////////////////////////////////////////////////////
        TextView txtmaxPrice = (TextView)convertView.findViewById(R.id.txtmaxPrice2);
        txtmaxPrice.setText(solution.get(position).getMaxPrice());




        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,StackMain.class);
                Bundle bundle = new Bundle();
                bundle.putString("fid",v.getTag().toString());
                bundle.putString("ServiceTitle",txtserviceName.getText().toString());
                bundle.putInt("CollectionOrSolution",2);
                intent.putExtras(bundle);
                context.startActivity(intent);


            }
        });

        return convertView;
    }
}
