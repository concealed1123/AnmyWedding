package com.org.iii.mywedding;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link BrideSecPriceProvideServices_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link BrideSecPriceProvideServices_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BrideSecPriceProvideServices_Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;
    ///////////////////////////////////////////////////////////////////////////////
    private View.OnClickListener btnFirst_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Fragment findbridesecearly_fragment = new FindBrideSecEarly_Fragment();
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_main,findbridesecearly_fragment).commit();

        }
    };
    ///////////////////////////////////////////////////////////////////////////////
    private View.OnClickListener btnNext_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Fragment bridesec_enough_communicate_fragment = new BrideSecEnoughCommunicate_Fragment();
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_main,bridesec_enough_communicate_fragment).commit();

        }
    };
    ///////////////////////////////////////////////////////////////////////////////
    private View.OnClickListener btnPrevious_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Fragment bridesec_evaluation_fragment = new BrideSecEvaluation_Fragment();
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_main,bridesec_evaluation_fragment).commit();


        }
    };
    ///////////////////////////////////////////////////////////////////////////////
    private View.OnClickListener btnLast_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Fragment bridesec_ondaynotice_fragment = new  BrideSecOnDayNotice_Fragment();
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_main,bridesec_ondaynotice_fragment).commit();
        }
    };
    ///////////////////////////////////////////////////////////////////////////////
    private View.OnClickListener btnList_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Fragment act_bridesec_Fragment = new ActBrideSec_Fragment();
            FragmentManager manager = getFragmentManager();
            manager.beginTransaction().replace(R.id.fragment_main,act_bridesec_Fragment).commit();

        }
    };
    ///////////////////////////////////////////////////////////////////////////////

    public BrideSecPriceProvideServices_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BrideSecPriceProvideServices_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static BrideSecPriceProvideServices_Fragment newInstance(String param1, String param2) {
        BrideSecPriceProvideServices_Fragment fragment = new BrideSecPriceProvideServices_Fragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.bridesecpriceprovideservices_fragment, container, false);
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
    }
*/
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
        ///////////////////////////////////////////////////////////////
        btnFirst = (Button) getActivity().findViewById(R.id.btnFirst);
        btnFirst.setOnClickListener(btnFirst_click);
        ///////////////////////////////////////////////////////////////
        btnNext = (Button) getActivity().findViewById(R.id.btnNext);
        btnNext.setOnClickListener(btnNext_click);
        ///////////////////////////////////////////////////////////////
        btnPrevious = (Button) getActivity().findViewById(R.id.btnPrevious);
        btnPrevious.setOnClickListener(btnPrevious_click);
        ///////////////////////////////////////////////////////////////
        btnLast = (Button) getActivity().findViewById(R.id.btnLast);
        btnLast.setOnClickListener(btnLast_click);
        ///////////////////////////////////////////////////////////////
        btnList = (Button) getActivity().findViewById(R.id.btnList);
        btnList.setOnClickListener(btnList_click);
        ///////////////////////////////////////////////////////////////
    }
    Button btnFirst;
    Button btnNext;
    Button btnPrevious;
    Button btnLast;
    Button btnList;
}