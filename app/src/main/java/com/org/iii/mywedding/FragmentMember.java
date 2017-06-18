package com.org.iii.mywedding;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMember extends Fragment {


    public FragmentMember() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_member, container, false);



    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        member_txtPhone = (EditText) getActivity().findViewById(R.id.member_txtPhone);
        member_txtEmail = (EditText) getActivity().findViewById(R.id.member_txtEmail);
        member_txtSite = (EditText) getActivity().findViewById(R.id.member_txtSite);
        member_txtId = (EditText) getActivity().findViewById(R.id.member_txtId);
    }
    EditText member_txtSite;
    EditText member_txtPhone;
    EditText member_txtEmail;
    EditText member_txtId;

}
