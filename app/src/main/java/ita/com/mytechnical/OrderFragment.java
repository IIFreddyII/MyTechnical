package ita.com.mytechnical;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class OrderFragment extends DialogFragment {

    private Button maps;
    String url = "https://www.google.com.mx/maps/place/Instituto+Tecnol%C3%B3gico+de+Aguascalientes/@21.8782247,-102.2651059,17z/data=!3m1!4b1!4m5!3m4!1s0x8429ee069d6cf307:0xd93b5294c07171a7!8m2!3d21.8782197!4d-102.2629172";


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return showDialog();
    }

    private AlertDialog showDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =  getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_order, null);
        builder.setView(view);
        return builder.create();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_order, container, false);

        maps= root.findViewById(R.id.btn_map);


        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Uri uri = Uri.parse(url);
                //Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                //startActivity(intent);
                Toast.makeText(getActivity(),"Text!",Toast.LENGTH_SHORT).show();
            }
        });

        return root;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

}