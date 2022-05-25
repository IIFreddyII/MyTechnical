package ita.com.mytechnical;

<<<<<<< HEAD
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
=======
import android.os.Bundle;

import androidx.fragment.app.Fragment;
>>>>>>> 7a672b9 (se cambio el icono de la aplicacion)

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

<<<<<<< HEAD
import java.util.Timer;
import java.util.TimerTask;


public class AprobadoFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private Button btn_aprobado;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_aprobado, container, false);

        btn_aprobado = root.findViewById(R.id.btn_aprobado);
        btn_aprobado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
                Navigation.findNavController(view).navigate(R.id.homeServiceFragment);
            }
        });

        return root;
    }

    private void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater =  getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_dialog, null);
        builder.setView(view);
        AlertDialog dialog = builder.create();
        dialog.show();
=======
/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AprobadoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AprobadoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AprobadoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AprobadoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AprobadoFragment newInstance(String param1, String param2) {
        AprobadoFragment fragment = new AprobadoFragment();
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
        return inflater.inflate(R.layout.fragment_aprobado, container, false);
>>>>>>> 7a672b9 (se cambio el icono de la aplicacion)
    }
}