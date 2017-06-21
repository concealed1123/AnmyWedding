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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ActBrideSec_Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ActBrideSec_Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ActBrideSec_Fragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    ListView listview2;
    String[] BrideSecNotice = {"找新秘趁早","新秘的作品透露了...？","看新秘評價避免踩雷",
            "新祕的報價能提供哪些服務","造型溝通要充分","試個妝不後悔","簽約時，需注意的事項",
            "保養之2大關鍵重點","婚禮前一天準備工作","造型當天的注意事項"};
    ArrayAdapter<String> adap2;

    public ActBrideSec_Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ActBrideSec_Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ActBrideSec_Fragment newInstance(String param1, String param2) {
        ActBrideSec_Fragment fragment = new ActBrideSec_Fragment();
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
        View view = inflater.inflate(R.layout.actbridesec_fragment, container, false);
        listview2 =(ListView)view.findViewById(R.id.myListView2);
        adap2 = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                BrideSecNotice );
        listview2.setAdapter(adap2);

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

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listview2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long rowId) {

                if (position == 0){
                    Fragment findbridesecearly_fragment = new FindBrideSecEarly_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,findbridesecearly_fragment).commit();
                    Toast.makeText(getContext(),"你選了"+BrideSecNotice[position],Toast.LENGTH_SHORT).show();
                }

                else if(position == 1){
                    Fragment bridesec_collection_fragment = new BrideSecCollection_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,bridesec_collection_fragment).commit();
                    Toast.makeText(getContext(),"你選了"+BrideSecNotice[position],Toast.LENGTH_SHORT).show();
                }

                else if(position == 2){
                    Fragment bridesec_evaluation_fragment = new BrideSecEvaluation_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,bridesec_evaluation_fragment).commit();
                    Toast.makeText(getContext(),"你選了"+BrideSecNotice[position],Toast.LENGTH_SHORT).show();
                }
                else if(position == 3){
                    Fragment bridesec_priceprovide_services_fragment = new BrideSecPriceProvideServices_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,bridesec_priceprovide_services_fragment).commit();
                    Toast.makeText(getContext(),"你選了"+BrideSecNotice[position],Toast.LENGTH_SHORT).show();
                }
                else if(position == 4){
                    Fragment bridesec_enough_communicate_fragment = new BrideSecEnoughCommunicate_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,bridesec_enough_communicate_fragment).commit();
                    Toast.makeText(getContext(),"你選了"+BrideSecNotice[position],Toast.LENGTH_SHORT).show();

                }
                else if(position == 5){


                }
                else if(position == 6){


                }
                else if(position == 7){

                }
                else if(position == 8){

                }
                else if(position == 9){

                }



            }
        });
    }
}
