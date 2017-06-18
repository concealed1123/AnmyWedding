package com.org.iii.mywedding;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * Created by Michael on 2017/6/18.
 */

public class ActWeddingPhoto extends ListActivity {
    String[] PhotoNotice = {"攝影服務","化妝造型","攝影產品","贈品&出借物品","挑片&美編","禮服選擇&出借","付款"};
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        if(position == 0){
            Intent intent = new Intent(ActWeddingPhoto.this,ActPhotoServices.class);
            startActivity(intent);
        }
        else if(position == 1){
            Intent intent = new Intent(ActWeddingPhoto.this,ActMakeUp.class);
            startActivity(intent);

        }
        else if(position == 2){
            Intent intent = new Intent(ActWeddingPhoto.this,ActPhotoProduction.class);
            startActivity(intent);

        }
        else if(position == 3){
            Intent intent = new Intent(ActWeddingPhoto.this,ActGiftandLendThings.class);
            startActivity(intent);

        }
        else if(position == 4){
            Intent intent = new Intent(ActWeddingPhoto.this,ActPickphotoandArtedit.class);
            startActivity(intent);

        }
        else if(position == 5){
            Intent intent = new Intent(ActWeddingPhoto.this,ActChooseDressandBorrow.class);
            startActivity(intent);

        }
        else {
            Intent intent = new Intent(ActWeddingPhoto.this,ActPayment.class);
            startActivity(intent);

        }




    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);



        ListAdapter adap = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                PhotoNotice);

        setListAdapter(adap);
    }
}
