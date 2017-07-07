package com.org.iii.mywedding;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.org.iii.mywedding.collection.CBrideSec;
import com.org.iii.mywedding.collection.CTakeWeddingPic;
import com.org.iii.mywedding.collection.CWeddingRec;
import com.org.iii.mywedding.collection.CWeddingSite;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentGallery extends Fragment {


    private View.OnClickListener btnService1_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getActivity(),CTakeWeddingPic.class));
            /*
            StoreOneWork_Fragment storeOneWork_fragment = new StoreOneWork_Fragment();
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_main,storeOneWork_fragment).commit();
            */
            //startActivity(new Intent(getActivity(),StackMain.class));  //這裡要用getactivity
        }
    };
    private View.OnClickListener btnService2_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getActivity(),CWeddingRec.class));
            //startActivity(new Intent(getActivity(),StackMain.class));  //這裡要用getactivity
        }
    };
    private View.OnClickListener btnService3_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getActivity(),CBrideSec.class));
            //startActivity(new Intent(getActivity(),StackMain.class));  //這裡要用getactivity
        }
    };
    private View.OnClickListener btnService4_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(getActivity(),CWeddingSite.class));
            //startActivity(new Intent(getActivity(),StackMain.class));  //這裡要用getactivity
        }
    };

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnService1 = (ImageButton) getActivity().findViewById(R.id.btnService1);
        btnService1.setOnClickListener(btnService1_click);
        btnService2 = (ImageButton) getActivity().findViewById(R.id.btnService2);
        btnService2.setOnClickListener(btnService2_click);
        btnService3 = (ImageButton) getActivity().findViewById(R.id.btnService3);
        btnService3.setOnClickListener(btnService3_click);
        btnService4 = (ImageButton) getActivity().findViewById(R.id.btnService4);
        btnService4.setOnClickListener(btnService4_click);

    }

    ImageButton btnService1;
    ImageButton btnService2;
    ImageButton btnService3;
    ImageButton btnService4;

}
