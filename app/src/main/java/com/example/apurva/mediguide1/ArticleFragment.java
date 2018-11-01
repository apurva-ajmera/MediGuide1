package com.example.apurva.mediguide1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ArticleFragment extends Fragment {



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_article,container,false);

        Button btnSkin = (Button)view.findViewById(R.id.skin_crt_btn);

        btnSkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent skinIntent = new Intent(getActivity(),SkinActivity.class);
                startActivity(skinIntent);
            }
        });


        return view;

    }

}
