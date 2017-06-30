package com.org.iii.mywedding;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link StoreOne_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link StoreOne_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StoreOne_Fragment extends Fragment {
    ConnenctToMSSQL connenctToMSSQL = new ConnenctToMSSQL();

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public StoreOne_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment StoreOne_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static StoreOne_Fragment newInstance(String param1, String param2) {
        StoreOne_Fragment fragment = new StoreOne_Fragment();
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
        View view = inflater.inflate(R.layout.storeone_fragment, container, false);
        connenctToMSSQL.open();
        viewData();
        StoName = (TextView) view.findViewById(R.id.StoName);
        StoPhone = (TextView) view.findViewById(R.id.StoPhone);
        StoEmail = (TextView) view.findViewById(R.id.StoEmail);
        StoAddress = (TextView) view.findViewById(R.id.StoAddress);


        StoName.setText(connenctToMSSQL.stores1.get(0));
        StoPhone.setText(connenctToMSSQL.stores1.get(1));
        StoEmail.setText(connenctToMSSQL.stores1.get(2));
        StoAddress.setText(connenctToMSSQL.stores1.get(3));


        return view;

    }


    private void viewData(){
        connenctToMSSQL.getdata1("select fName,fPhone,fEmail,fAddress from tMember where fIdentity = 1 and fIdMember = 6");
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

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
    TextView StoName;
    TextView StoPhone;
    TextView StoEmail;
    TextView StoAddress;



}
