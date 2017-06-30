package com.org.iii.mywedding;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMember extends Fragment {
    ConnenctToMSSQL connenctToMSSQL = new ConnenctToMSSQL();
    ArrayAdapter<String> adap;
    ListView Sto_listView;



    public FragmentMember() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        connenctToMSSQL.open();
        viewData();
        View view = inflater.inflate(R.layout.fragment_member, container, false);
        Sto_listView = (ListView)view.findViewById(R.id.Sto_listView);
        adap = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                connenctToMSSQL.stores);
        Sto_listView.setAdapter(adap);
        return view;
    }
    private void viewData(){
        connenctToMSSQL.getdata("select fName from tMember where fIdentity = 1");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        Sto_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    StoreOne_Fragment storeOne_fragment = new StoreOne_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,storeOne_fragment).commit();

                }
                else if(position == 1){
                    StoreTwo_Fragment storeTwo_fragment = new StoreTwo_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,storeTwo_fragment).commit();

                }
                else if(position == 2){
                    StoreThree_Fragment storeThree_fragment = new StoreThree_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,storeThree_fragment).commit();

                }
                else if(position == 3){
                    StoreFour_Fragment storeFour_fragment = new StoreFour_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,storeFour_fragment).commit();

                }
                else if(position == 4){
                    StoreFive_Fragment storeFive_fragment = new StoreFive_Fragment();
                    FragmentManager manager = getFragmentManager();
                    manager.beginTransaction().replace(R.id.fragment_main,storeFive_fragment).commit();

                }
            }
        });


    }

}
