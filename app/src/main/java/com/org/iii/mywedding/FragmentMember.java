package com.org.iii.mywedding;


import android.content.Intent;
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
                    startActivity(new Intent(getActivity(),StoreOne.class));
                }
                else if(position == 1){
                    startActivity(new Intent(getActivity(),StoreTwo.class));
                }
                else if(position == 2){
                    startActivity(new Intent(getActivity(),StoreThree.class));
                }
                else if(position == 3){
                    startActivity(new Intent(getActivity(),StoreFour.class));
                }
                else if(position == 4){
                    startActivity(new Intent(getActivity(),StoreFive.class));
                }
                else if(position == 5){
                    startActivity(new Intent(getActivity(),StoreSix.class));
                }
                else if(position == 6){
                    startActivity(new Intent(getActivity(),StoreSeven.class));
                }
                else if(position == 7){
                    startActivity(new Intent(getActivity(),StoreEight.class));
                }
                else if(position == 8){
                    startActivity(new Intent(getActivity(),StoreNine.class));
                }
                else if(position == 9){
                    startActivity(new Intent(getActivity(),StoreTen.class));
                }
                else if(position == 10){
                    startActivity(new Intent(getActivity(),StoreEleven.class));
                }
                else if(position == 11){
                    startActivity(new Intent(getActivity(),StoreTwelev.class));
                }
                else if(position == 12){
                    startActivity(new Intent(getActivity(),StoreThirteen.class));
                }
            }
        });


    }

}
