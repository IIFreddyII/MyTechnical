package ita.com.mytechnical;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
<<<<<<< HEAD
import android.widget.Toast;

=======
>>>>>>> 7a672b9 (se cambio el icono de la aplicacion)

public class PaymentFragment extends Fragment {






    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    private Button button_Aprobado;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_payment, container, false);

        button_Aprobado = root.findViewById(R.id.btn_cash);


        button_Aprobado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.aprobadoFragment);
<<<<<<< HEAD
                Toast.makeText(getActivity(),"Aprobado!",Toast.LENGTH_SHORT).show();
=======

>>>>>>> 7a672b9 (se cambio el icono de la aplicacion)
            }
        });

        return root;
    }
}