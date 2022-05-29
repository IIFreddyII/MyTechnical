package ita.com.mytechnical;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.google.android.material.bottomsheet.BottomSheetDialog;


public class HomeServiceFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    private Button btn_showOrder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View root = inflater.inflate(R.layout.fragment_home_service, container, false);

       btn_showOrder = root.findViewById(R.id.btn_showOrder);
       btn_showOrder.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               showDialog();
           }
       });

        return root;
    }

    private void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =  getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_order, null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}