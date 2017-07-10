package com.org.iii.mywedding.notice;

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

import com.org.iii.mywedding.R;



    public class ActWeddingPhoto_Fragment extends Fragment {
        ListView listview;
    String[] PhotoNotice = {"攝影服務","化妝造型","攝影產品",
            "贈品&出借物品","挑片&美編","禮服選擇&出借","付款"};
    ArrayAdapter<String> adap;


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
        listview =(ListView)view.findViewById(R.id.myListView);

        adap = new ArrayAdapter<String>(
                        getActivity(),
                        R.layout.manul_adapter,
                        PhotoNotice);
        listview.setAdapter(adap);

        return view;

    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long rowId) {

                if (position == 0){
                    Fragment actphotoservices_frgament = new ActPhotoServices_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,actphotoservices_frgament).commit();
                    Toast.makeText(getContext(),"你選了"+PhotoNotice[position]+"注意事項",Toast.LENGTH_SHORT).show();
                }

                else if(position == 1){
                    Fragment actmakeup_fragment = new ActMakeUp_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,actmakeup_fragment).commit();
                    Toast.makeText(getContext(),"你選了"+PhotoNotice[position]+"注意事項",Toast.LENGTH_SHORT).show();

                }

                else if(position == 2){
                    Fragment act_photo_production_fragment = new ActPhotoProduction_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,act_photo_production_fragment).commit();
                    Toast.makeText(getContext(),"你選了"+PhotoNotice[position]+"注意事項",Toast.LENGTH_SHORT).show();

                }
                else if(position == 3){
                    Fragment act_gift_and_lend_Things_fragment = new ActGiftandLendThings_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,act_gift_and_lend_Things_fragment).commit();
                    Toast.makeText(getContext(),"你選了"+PhotoNotice[position]+"注意事項",Toast.LENGTH_SHORT).show();

                }
                else if(position == 4){
                    Fragment act_pickphoto_and_artedit_fragment = new ActPickphotoandArtedit_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,act_pickphoto_and_artedit_fragment).commit();
                    Toast.makeText(getContext(),"你選了"+PhotoNotice[position]+"注意事項",Toast.LENGTH_SHORT).show();

                }
                else if(position == 5){
                    Fragment act_choosedress_and_borrow_fragment = new ActChooseDressandBorrow_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,act_choosedress_and_borrow_fragment).commit();
                    Toast.makeText(getContext(),"你選了"+PhotoNotice[position]+"注意事項",Toast.LENGTH_SHORT).show();

                }
                else{
                    Fragment act_payment_fragment = new ActPayment_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,act_payment_fragment).commit();
                    Toast.makeText(getContext(),"你選了"+PhotoNotice[position]+"注意事項",Toast.LENGTH_SHORT).show();

                }



            }
        });
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



}
