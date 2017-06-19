package com.org.iii.mywedding;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ActWeddingPhoto_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ActWeddingPhoto_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ActWeddingPhoto_Fragment extends Fragment {
    String[] PhotoNotice = {"攝影服務","化妝造型","攝影產品",
            "贈品&出借物品","挑片&美編","禮服選擇&出借","付款"};
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public ActWeddingPhoto_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ActWeddingPhoto_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ActWeddingPhoto_Fragment newInstance(String param1, String param2) {
        ActWeddingPhoto_Fragment fragment = new ActWeddingPhoto_Fragment();
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
        //return inflater.inflate(R.layout.actweddingphoto_fragment, container, false);
        View view = inflater.inflate(R.layout.actweddingphoto_fragment, container, false);
        ListView listview =(ListView)view.findViewById(R.id.myListView);
        String[] PhotoNotice = {"攝影服務","化妝造型","攝影產品",
                "贈品&出借物品","挑片&美編","禮服選擇&出借","付款"};
        ArrayAdapter<String> adap = new ArrayAdapter<String>(
                        getActivity(),
                        android.R.layout.simple_list_item_1,
                        PhotoNotice);
        listview.setAdapter(adap);

        return view;

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

    /*private ListView.OnItemClickListener listener = new ListView.OnItemClickListener(){

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            if(position == 0){
                ActPhotoServices_Fragment actphotoservices_fragment = new ActPhotoServices_Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.wedding_photo,actphotoservices_fragment).commit();

            }
            else if(position == 1){


            }
            else if(position == 2){

            }
            else if(position == 3){

            }
            else if(position == 4){

            }
            else if(position == 5){

            }


        }
    };*/
    ListView.OnItemSelectedListener listener = new ListView.OnItemSelectedListener(){

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            if(position == 0){
                ActPhotoServices_Fragment actphotoservices_fragment = new ActPhotoServices_Fragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.wedding_photo,actphotoservices_fragment).commit();

            }
            else if(position == 1){


            }
            else if(position == 2){

            }
            else if(position == 3){

            }
            else if(position == 4){

            }
            else if(position == 5){

            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };
}
