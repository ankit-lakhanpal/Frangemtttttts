package com.ankitlakhanpal.frangemtttttts;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentContainer extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transection = manager.beginTransaction();

        intro frag=new intro();
        transection.add(R.id.Fragment_contaier, frag, "TAG3");
        transection.commit();
        return inflater.inflate(R.layout.fragmrnt_container, container, false);
    }


}
