package com.org.iii.mywedding;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.org.iii.mywedding.solutions.BrideSec;
import com.org.iii.mywedding.solutions.TakeWeddingPic;
import com.org.iii.mywedding.solutions.WeddingREC;
import com.org.iii.mywedding.solutions.WeddingSite;

import okhttp3.OkHttpClient;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link FragmentSolution.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link FragmentSolution#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentSolution extends Fragment {
    private OkHttpClient client = new OkHttpClient();
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private View.OnClickListener btnSolution1_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //startActivity(new Intent(getActivity(),TakeWeddingPic.class));

            Intent intent = new Intent(getActivity(),BrideSec.class);
            Bundle bundle = new Bundle();
            bundle.putInt("ServiceClass",1);
            intent.putExtras(bundle);
            startActivity(intent);

        }
    };
    private View.OnClickListener btnSolution2_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(),BrideSec.class);
            Bundle bundle = new Bundle();
            bundle.putInt("ServiceClass",2);
            intent.putExtras(bundle);
            startActivity(intent);

        }
    };
    private View.OnClickListener btnSolution3_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(),BrideSec.class);
            Bundle bundle = new Bundle();
            bundle.putInt("ServiceClass",3);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };
    private View.OnClickListener btnSolution4_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(),BrideSec.class);
            Bundle bundle = new Bundle();
            bundle.putInt("ServiceClass",4);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    };

    public FragmentSolution() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentSolution.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentSolution newInstance(String param1, String param2) {
        FragmentSolution fragment = new FragmentSolution();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
//        getActivity().setTitle("方案");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_solution, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }
/*
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }*/

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        btnSolution1 = (ImageButton) getActivity().findViewById(R.id.btnSolution11);
        btnSolution1.setOnClickListener(btnSolution1_click);
        btnSolution2 = (ImageButton) getActivity().findViewById(R.id.btnSolution12);
        btnSolution2.setOnClickListener(btnSolution2_click);
        btnSolution3 = (ImageButton) getActivity().findViewById(R.id.btnSolution13);
        btnSolution3.setOnClickListener(btnSolution3_click);
        btnSolution4 = (ImageButton) getActivity().findViewById(R.id.btnSolution14);
        btnSolution4.setOnClickListener(btnSolution4_click);

    }

    ImageButton btnSolution1;
    ImageButton btnSolution2;
    ImageButton btnSolution3;
    ImageButton btnSolution4;

}
