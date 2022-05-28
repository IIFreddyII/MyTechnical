package ita.com.mytechnical;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;


public class RegisterActivity extends Activity {

    EditText et_name, et_email, et_password, et_phone;
    Button btn_register;

    FirebaseFirestore firebaseFirestore;
    FirebaseAuth firebaseAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        firebaseFirestore = FirebaseFirestore.getInstance();
        firebaseAuth = FirebaseAuth.getInstance();


        et_name = findViewById(R.id.etxt_name_register);
        et_email = findViewById(R.id.etxt_email_register);
        et_password = findViewById(R.id.etxt_password_register);
        et_phone =  findViewById(R.id.etxt_phone_register);

        btn_register =  findViewById(R.id.btn_signup_register);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = et_name.getText().toString().trim();
                String email = et_email.getText().toString().trim();
                String password = et_password.getText().toString().trim();
                String phone = et_phone.getText().toString().trim();

                if(name.isEmpty() && email.isEmpty() && password.isEmpty() && phone.isEmpty()){
                    Toast.makeText(RegisterActivity.this, "Complete los datos", Toast.LENGTH_LONG).show();
                }else {
                    RegisterUser(name, email, password, phone);
                }
            }
        });
    }

    private void RegisterUser(String name, String email, String password, String phone) {

    }


    public void Back(View view){
        Intent back =  new Intent(this, WelcomeActivity.class);
        startActivity(back);
    }

    public void Login(View view){
        Intent login =  new Intent(this, LoginActivity.class);
        startActivity(login);
    }
}